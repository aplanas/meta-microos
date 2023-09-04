SUMMARY = "Documentation for texlive-inputenx"
DESCRIPTION = "This package includes the documentation for texlive-inputenx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn52986"

RPM_NAME = "texlive-inputenx-doc-2023.209.1.12svn52986-54.1.noarch.rpm"
RPM_HASH = "cb2ed2464cb22f3a2956dbda12499250dc851a25809d8df340817e578a369d36c49af342e5ac86f566d220377ce1b8e3b52a90e7ef8740613b30fab1eb06072f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
