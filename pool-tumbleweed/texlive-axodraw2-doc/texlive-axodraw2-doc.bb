SUMMARY = "Documentation for texlive-axodraw2"
DESCRIPTION = "This package includes the documentation for texlive-axodraw2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1.1csvn58155"

RPM_NAME = "texlive-axodraw2-doc-2023.209.2.1.1csvn58155-54.1.noarch.rpm"
RPM_HASH = "ac3bbfe3c8d047adf45926a0bddbafdf699b3d19d27bd6a842fb294c1c1ad8717a6d64ce7e6c8a02e9e45ab0e24e32e90b9fa2354f04b3699e16ccd096da57e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-axohelp.1 \
texlive-axodraw2-doc"

RDEPENDS:${PN} += ""

inherit rpm
