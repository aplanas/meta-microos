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

RPM_NAME = "tmux-3.3a-4.1.aarch64.rpm"
RPM_HASH = "b8bd74e1ec11cf3480aaa9a58fbd65e84a8e34eedec93a6328cd9764ab8e1d5b75aa1bb8a667692b820585a7f5f34775e8c11f47fcbf1b65ad94e86d19b3be49"

RPROVIDES:${PN} += "tmux \
tmux(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent_core-2.1.so.7()(64bit) \
libm.so.6()(64bit) \
libresolv.so.2()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
