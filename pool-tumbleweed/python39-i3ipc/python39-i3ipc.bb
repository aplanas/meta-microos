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

RPM_NAME = "python39-i3ipc-2.2.1-4.9.noarch.rpm"
RPM_HASH = "109c362fd89c740860336f744b2dd71c84ca54fb585033f62214cf8a45379c95a21ade0df6b0367f90c814d9804797269eeaeb706a77ee041d6797c150071495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-i3ipc \
python39-i3ipc \
python3dist-i3ipc"

RDEPENDS:${PN} += "python-abi \
python39-python-xlib"

inherit rpm
