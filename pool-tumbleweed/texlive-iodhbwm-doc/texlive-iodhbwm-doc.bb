SUMMARY = "Documentation for texlive-iodhbwm"
DESCRIPTION = "This package includes the documentation for texlive-iodhbwm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn57773"

RPM_NAME = "texlive-iodhbwm-doc-2023.209.1.2.2svn57773-54.1.noarch.rpm"
RPM_HASH = "e0dffb8a98c0e9cbde6e9118e2d07fdc249189f3b389bd37bfdebca8aef338bf3f59203856bd3dc5976b358ce63885f612866ac227a5d2a72f24ff8c78723328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-iodhbwm-doc-de \
texlive-iodhbwm-doc"

RDEPENDS:${PN} += ""

inherit rpm
