SUMMARY = "Import and Export of Autodesk 3DS Files"
DESCRIPTION = "Lib3ds is a free alternative to Autodesk's 3DS File Toolkit for \
handling 3DS files. Its main goal is to simplify the creation of 3DS \
import and export filters."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lib3ds-devel-1.3.0-31.9.aarch64.rpm"
RPM_HASH = "9a0cc9e69ee8f4942780831cae1390d9d7d7941919f586b2d609fc6385f4878364a8e0e7ce7591091a7d832552b993a3cf48b667d97e67208ce1bbd97ae00909"

RPROVIDES:${PN} += "lib3ds-devel \
pkgconfig-lib3ds"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
lib3ds-1-3 \
lib3ds-1.so.3 \
libc.so.6"

inherit rpm
