SUMMARY = "Documentation for texlive-york-thesis"
DESCRIPTION = "This package includes the documentation for texlive-york-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn23348"

RPM_NAME = "texlive-york-thesis-doc-2023.209.3.6svn23348-53.2.noarch.rpm"
RPM_HASH = "517d42c24dc0152c36901f71e89c554a8a931081e236a97bb6bbb5eefca45dec5ad826aa7cac02e0f2fcd3651bc5f6c48d7a641ac5657a33cb3148ba062ae6d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-york-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
