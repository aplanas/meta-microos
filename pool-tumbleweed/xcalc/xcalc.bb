SUMMARY = "Scientific calculator for X"
DESCRIPTION = "xcalc is a scientific calculator X11 client that can emulate a TI-30 \
or an HP-10C."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "xcalc-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "c9e3f02271dcc98fda802dcbf83d0f20f48cef2d642e356f7292bb35809635677a3b9b9ffbc3e93cde093657a59245ff19ed7b22a4e1960d7ce0f8ec84a2c4da"

RPROVIDES:${PN} += "xcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
