SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "The libimageviewer-devel package contains the header files and developer docs \
for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimageviewer-devel-1.0.24-1.2.aarch64.rpm"
RPM_HASH = "5abc08c05c40672db50d45584e7fe7274118d5ba932fd5a3e32722466b429a9c9969e3c4cb845ccff659525c205ca4a32627b776189e997936505c2d81cdf468"

RPROVIDES:${PN} += "libimageviewer-devel \
pkgconfig-libimageviewer"

RDEPENDS:${PN} += "libimageviewer0-1"

inherit rpm
