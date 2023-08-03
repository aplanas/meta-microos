SUMMARY = "Documentation for texlive-simpleoptics"
DESCRIPTION = "This package includes the documentation for texlive-simpleoptics"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn62977"

RPM_NAME = "texlive-simpleoptics-doc-2023.209.1.1.1svn62977-54.1.noarch.rpm"
RPM_HASH = "52ebdcca531349b4dfd973c39a4a326b171f18630be84abdca0aa8dde28d3b3283a14af62c37fb0fdb75f73f1ba57353c5f0bdc8f5d1ddc0286ba9f6a7dedd25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleoptics-doc"

RDEPENDS:${PN} += ""

inherit rpm
