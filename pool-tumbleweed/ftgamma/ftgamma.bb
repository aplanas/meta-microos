SUMMARY = "Screen gamma calibration helper"
DESCRIPTION = "Screen gamma calibration helper \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftgamma-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "8b40a8a3e447c4d8a34bd696d3048ba531b68a6b9a5afb28e75696e2974fb6716c5c559c41c00ef6d939bed8ed7255e024b4df841a14f4096b8fe4b9026665cf"

RPROVIDES:${PN} += "ftgamma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
