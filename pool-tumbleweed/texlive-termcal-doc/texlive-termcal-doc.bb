SUMMARY = "Documentation for texlive-termcal"
DESCRIPTION = "This package includes the documentation for texlive-termcal"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn22514"

RPM_NAME = "texlive-termcal-doc-2023.209.1.8svn22514-55.1.noarch.rpm"
RPM_HASH = "024c1f5573867b48d8ab9c2aa1597cecfa46d07c939302ac118d96a63ced50e70e98f06606b3781f1699d3570bc39acc567b6d58fc169305540562f55afcb4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
