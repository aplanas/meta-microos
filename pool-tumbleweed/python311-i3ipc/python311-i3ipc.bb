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

RPM_NAME = "python311-i3ipc-2.2.1-4.7.noarch.rpm"
RPM_HASH = "b90a860b4e0b135dd77432619dd5ea921ed9e91db0b1e51fc606885906168adb38965057c85d192cdf596ba45be1607616d220e62582f67980cad43ac71bdb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(i3ipc) \
python311-i3ipc \
python3dist(i3ipc)"

RDEPENDS:${PN} += "python(abi) \
python311-python-xlib"

inherit rpm
