SUMMARY = "Python library for i3 WM extensions"
DESCRIPTION = "python-i3ipc is a Python library for controlling the i3 window manager which \
aims to be used by scripts and applications which interact with the window \
manager like status line generators, notification daemons and pagers. \
 \
This library uses i3’s interprocess communication, which is the interface \
that i3 WM uses to receive commands from client applications such as i3-msg. It \
also features a publish/subscribe mechanism for notifying interested parties of \
window manager events."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python310-i3ipc-2.2.1-4.7.noarch.rpm"
RPM_HASH = "f58363ae9b03ce150cbcc373cf2b8d3c7340b2787b324b9f27f2597b539a2df227489864c6327f9ef254c055bbd2d0132fb90e39acf23d7ce91525de3a444d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-i3ipc \
python3.10dist-i3ipc \
python310-i3ipc \
python3dist-i3ipc"

RDEPENDS:${PN} += "python-abi \
python310-python-xlib"

inherit rpm
