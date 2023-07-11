SUMMARY = "Terminal multiplexer"
DESCRIPTION = "tmux is a terminal multiplexer: it enables a number of terminals (or windows), \
each running a separate program, to be created, accessed, and controlled from a \
single screen. tmux may be detached from a screen and continue running in the \
background, then later reattached. tmux is intended to be a modern, \
BSD-licensed alternative to programs such as GNU screen. \
 \
tmux uses a client-server model. The server holds multiple sessions and each \
window is a independent entity which may be freely linked to multiple sessions, \
moved between sessions and otherwise manipulated. Each session may be attached \
to (display and accept keyboard input from) multiple clients."
LICENSE = "ISC & BSD-3-Clause & BSD-2-Clause"

PV = "3.3a"

RPM_NAME = "tmux-3.3a-4.2.aarch64.rpm"
RPM_HASH = "839532842b265f8b882cb56d896ceb6badd54f45801b50b70202785b45d0199e85fb90b15335965278d0661edd11153a997aceacfb992e51b964dc450a1a2ca5"

RPROVIDES:${PN} += "tmux"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libm.so.6 \
libresolv.so.2 \
libsystemd.so.0 \
libtinfo.so.6"

inherit rpm
