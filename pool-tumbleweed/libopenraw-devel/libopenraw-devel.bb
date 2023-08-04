SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.7"

RPM_NAME = "libopenraw-devel-0.3.7-1.1.aarch64.rpm"
RPM_HASH = "5a8ac7a2d970ca6b139cda7c06fa92033c25734df4d091ec36b58eb0b5aeb4bb3af6cff776fd00a4756e18cf0e5ad6f53729377eee63d722e3e7efed9b4170d2"

RPROVIDES:${PN} += "libopenraw-devel \
pkgconfig-libopenraw-0.3 \
pkgconfig-libopenraw-gnome-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gdk-pixbuf-devel \
libopenraw9 \
pkgconfig-libopenraw-0.3"

inherit rpm
