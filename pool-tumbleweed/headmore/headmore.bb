SUMMARY = "VNC client for character terminals"
DESCRIPTION = "headmore is a client for Virtual Network Computing (VNC), \
it is designed for running in character terminals such as \
Linux VT, xterm, or any other terminal emulator. headmore \
is fully capable of directing keyboard input to VNC and \
control mouse cursor movements."
LICENSE = "GPL-3.0"

PV = "1.2"

RPM_NAME = "headmore-1.2-1.23.aarch64.rpm"
RPM_HASH = "cde9b77fd277aacdd7e69dd8172c74e96530081c9c84e965377b2562595ea73742ea478ff587caf4fefd1df5b7ac5d517fa859c67c61cfad413755c8b6704278"

RPROVIDES:${PN} += "headmore \
headmore(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcaca.so.0()(64bit) \
libvncclient.so.1()(64bit)"

inherit rpm
