SUMMARY = "Dynamic resource editor for X Toolkit applications"
DESCRIPTION = "Editres is a tool that allows users and application developers to view \
the full widget hierarchy of any X Toolkit application that speaks the \
Editres protocol."
LICENSE = "X11"

PV = "1.0.8"

RPM_NAME = "editres-1.0.8-1.7.aarch64.rpm"
RPM_HASH = "0b6ac7fc42082a3412f13fefd2c00b855d4e5b1d7c8afb4d70a8460e24d7b0f05ca1999339ff23bb1426a769bcb57ab26353b8cd1559747f1595d21668d93318"

RPROVIDES:${PN} += "editres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
