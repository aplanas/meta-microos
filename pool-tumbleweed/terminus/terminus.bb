SUMMARY = "An X terminal written in Vala"
DESCRIPTION = "A terminal with the capabilities of Guake and Terminator."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "terminus-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "5407e6e069a24009b86eabb9a1cf65755723e321e543a1e6b24d5db1d339b61fdba0ddde705df7ffc82a5bb084df5ac0e50104d3e5649ee617e1f39bc666e55a"

RPROVIDES:${PN} += "config-terminus \
terminus"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
