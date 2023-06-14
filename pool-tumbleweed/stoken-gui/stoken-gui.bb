SUMMARY = "Graphical interface program for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package contains the graphical interface program for stoken."
LICENSE = "LGPL-2.0-or-later & BSD-3-Clause"

PV = "0.92"

RPM_NAME = "stoken-gui-0.92-1.21.aarch64.rpm"
RPM_HASH = "105f194237ae91400b7b7d3c2a9fc8fd205e57fbbad2d3d62ca795bd61830630bc48bd728a0f123c3b82938b49b67fac33e171a09857d7b16744de4d6b0b418f"

RPROVIDES:${PN} += "stoken-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstoken.so.1 \
libstoken1"

inherit rpm
