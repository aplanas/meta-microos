SUMMARY = "Library for manipulating memory bitmaps"
DESCRIPTION = "This package contains libraries for manipulating memory bitmaps."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.22.1"

RPM_NAME = "libpainter0-0.9.22.1-1.1.aarch64.rpm"
RPM_HASH = "b9beca9c04020afebb9dc8a9490477141e0f2d3dfc85e08610592a4fdf4a0cbf3a9a464497272800ec05f924b9a61afa279c2b6c7c62eda45c268d4dec507d8e"

RPROVIDES:${PN} += "libpainter.so.0 \
libpainter0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
