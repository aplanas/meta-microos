SUMMARY = "SSH client with optional GTK-based terminal emulator frontend"
DESCRIPTION = "PuTTY is a suite of terminal emulator application and client for \
serial consoles, raw TCP connections, and the computing protocols \
SSH, Telnet and rlogin. \
 \
The 'pterm' program is just the graphical terminal emulator similar \
to xterm, 'plink' is just the (console-based) SSH client similar to \
openssh, and 'putty' is the program that combines both in one."
LICENSE = "MIT"

PV = "0.78"

RPM_NAME = "putty-0.78-1.4.aarch64.rpm"
RPM_HASH = "cc3ce275beb3b85d4034f371a416995c43c8ac706829c9986b337fcf6f7c1a14b8b223cc4d95d690ce7d603deaf7d1c51f789fb39175b06b07510828f5425b61"

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
