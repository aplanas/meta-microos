SUMMARY = "Hash editor for libchewing"
DESCRIPTION = "This package contains a hash editor for chewing, an intelligent phonetic \
input method library for tranditional Chinese. \
 \
It's used to add, modify and remove entries in the chewing user database \
(usually located at ~/.chewing/uhash.dat)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "chewing-utils-0.5.1+git20200627.452f622-1.10.aarch64.rpm"
RPM_HASH = "d10266c7cec4a8821efdf23b6f9b3971ab2f7bb3524dc1ce0ed542344f02d2fb3d5c1137268a9ed347a3815360e2d5b0468d297ab69657b507582e90ac0f83fc"

RPROVIDES:${PN} += "chewing-utils"

RDEPENDS:${PN} += "libc.so.6 \
libchewing.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
