SUMMARY = "String viewer"
DESCRIPTION = "String viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftstring-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "b38b98ab63c73034488d8b70cfe02ffc7e77de695e22ac7e36d84d10ec69633907d39c4b21feb4a6c3e58003c8fecdb839e8cbf2ab93124ebf892e76688e894c"

RPROVIDES:${PN} += "ftstring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libm.so.6 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm
