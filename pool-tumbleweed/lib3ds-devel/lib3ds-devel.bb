SUMMARY = "Import and Export of Autodesk 3DS Files"
DESCRIPTION = "Lib3ds is a free alternative to Autodesk's 3DS File Toolkit for \
handling 3DS files. Its main goal is to simplify the creation of 3DS \
import and export filters."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lib3ds-devel-1.3.0-31.8.aarch64.rpm"
RPM_HASH = "a9a0001872e8a9106e47273993b32c7d0a7f51985e60d964a57928e77922150a68ac5b6b1edecd92edcd87edab9ae63799ecb16d6b645cac5a9e5d94eb5fc9e7"

RPROVIDES:${PN} += "lib3ds-devel \
pkgconfig-lib3ds"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
lib3ds-1-3 \
lib3ds-1.so.3 \
libc.so.6"

inherit rpm
