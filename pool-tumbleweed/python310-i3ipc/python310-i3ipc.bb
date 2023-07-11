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

RPM_NAME = "python310-i3ipc-2.2.1-4.9.noarch.rpm"
RPM_HASH = "dc1f251a912bf6d9a6139eebe09dfcc6628cc8a25164168ba04f8abe6bf8b91a4ab2c8e4c57d50f209290d426ae88dca09100af8721e294b8c18589e7e89818b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-i3ipc \
python310-i3ipc \
python3dist-i3ipc"

RDEPENDS:${PN} += "python-abi \
python310-python-xlib"

inherit rpm
