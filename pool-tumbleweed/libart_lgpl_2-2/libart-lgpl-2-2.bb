SUMMARY = "Libart Components Licensed under the LGPL"
DESCRIPTION = "Libart is a library for high-performance 2D graphics. It is currently \
being used as the antialiased rendering engine for GNOME Canvas. It is \
also the rendering engine for Gill, the GNOME Illustration application."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.21"

RPM_NAME = "libart_lgpl_2-2-2.3.21-25.4.aarch64.rpm"
RPM_HASH = "37897cd56d1930b9882a88b8403165be301857177956dd7902029b309699a65447ddc920939ef6a03dee1fdff8d612bb9db88d6b04f87d3516171a1a410e01ab"

RPROVIDES:${PN} += "libart-lgpl \
libart-lgpl-2-2 \
libart-lgpl-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
