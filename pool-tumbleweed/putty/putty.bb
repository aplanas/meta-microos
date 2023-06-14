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

RPM_NAME = "putty-0.78-1.3.aarch64.rpm"
RPM_HASH = "1c3a99d7c331fd686659267c9695e28dc4cacc605a5e0305018aec1e335f9e1698511d38629617e8ceb90fa519c00251f6d472cbd98396b7999d79b483be4043"

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
