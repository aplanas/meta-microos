SUMMARY = "Import and Export of Autodesk 3DS Files"
DESCRIPTION = "Lib3ds is a free alternative to Autodesk's 3DS File Toolkit for \
handling 3DS files. Its main goal is to simplify the creation of 3DS \
import and export filters."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lib3ds-1-3-1.3.0-31.9.aarch64.rpm"
RPM_HASH = "62f2b096d85c01801a655133ccfd6fbd561c0a096037c85a0b7833d5cc1f061ebce1425dc567e0aac356fbc8da8c45d33f00f7b525602fa77c1aa61277dc65dc"

RPROVIDES:${PN} += "lib3ds \
lib3ds-1-3 \
lib3ds-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
