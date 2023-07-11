SUMMARY = "Color palette viewer"
DESCRIPTION = "A program for viewing and copying colors from Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "palette-4.0.0-1.11.aarch64.rpm"
RPM_HASH = "f2e38df8353722811a3ef4ee2df478676411f89b46086ccee5a2cd1793a1ed17b4d72dd983e8cdc6d6115a8cb07469d100de29b7b2da10e7004344d0ab114c60"

RPROVIDES:${PN} += "palette"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
