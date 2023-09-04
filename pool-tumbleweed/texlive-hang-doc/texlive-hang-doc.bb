SUMMARY = "Documentation for texlive-hang"
DESCRIPTION = "This package includes the documentation for texlive-hang"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn43280"

RPM_NAME = "texlive-hang-doc-2023.209.2.1svn43280-54.2.noarch.rpm"
RPM_HASH = "2584d1e28cf55fe4dd023115d64782703a38e821dc09f4f9c97ac66dd51ca64b071b4280b10819a44f3fafc51c466b327aecdf35adfdb0d4a8ff56b5cc3cda81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hang-doc"

RDEPENDS:${PN} += ""

inherit rpm
