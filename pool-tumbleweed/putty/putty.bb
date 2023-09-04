SUMMARY = "SSH client with optional GTK-based terminal emulator frontend"
DESCRIPTION = "PuTTY is a suite of terminal emulator application and client for \
serial consoles, raw TCP connections, and the computing protocols \
SSH, Telnet and rlogin. \
 \
The 'pterm' program is just the graphical terminal emulator similar \
to xterm, 'plink' is just the (console-based) SSH client similar to \
openssh, and 'putty' is the program that combines both in one."
LICENSE = "MIT"

PV = "0.79"

RPM_NAME = "putty-0.79-1.1.aarch64.rpm"
RPM_HASH = "0633ce78cc8087ea1c4a08d286a776f0ad1d7bf90bfc1245d34135e249d3c40b2bc656701d46e1c75eafa37d2ba515b9926f60d4a2cf068fc0f4f314419a26a0"

RPROVIDES:${PN} += "putty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
