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

RPM_NAME = "python311-i3ipc-2.2.1-4.9.noarch.rpm"
RPM_HASH = "b3144ae7832c5e4f80b932b6a5dfc8f90b2d928c90550e4b8590c3ee9ab46e54baf93e10cdcc21657e9e078ca51222ae70802b51d4c68db4a7319c57cdcd8682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-i3ipc \
python3.11dist-i3ipc \
python311-i3ipc \
python3dist-i3ipc"

RDEPENDS:${PN} += "python-abi \
python311-python-xlib"

inherit rpm
