SUMMARY = "KtoBLZCheck development files"
DESCRIPTION = "Libraries, includes etc to develop with ktoblzcheck library."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "ktoblzcheck-devel-1.53-1.4.aarch64.rpm"
RPM_HASH = "8bf68bd634f82b7041b2f53b5380e8d113d41bd27ee42a4f716ded2dd91a67effaec2b33d19a55f3d18006fea0b9397c3cb373c4b3acab30779a27c0595d2821"

RPROVIDES:${PN} += "cmake-KtoBlzCheck \
ktoblzcheck-devel \
libktoblzcheck1-devel \
pkgconfig-ktoblzcheck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libktoblzcheck1"

inherit rpm
