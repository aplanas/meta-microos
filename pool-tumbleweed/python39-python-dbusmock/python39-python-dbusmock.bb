SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24.1"

RPM_NAME = "python39-python-dbusmock-0.24.1-3.1.noarch.rpm"
RPM_HASH = "cbec3f7a4ab5dafb6412a4a3a5bedaca903894e0ff8dbad1bb268c11c094e00c80bf754b9094f0107d2a84592a8f2138e10571d012f2347c6382a690344ac394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-dbusmock \
python39-dbusmock \
python39-python-dbusmock \
python3dist-python-dbusmock"

RDEPENDS:${PN} += "dbus-1-x11 \
python-abi \
python39-dbus-python \
python39-gobject \
typelib-GLib"

inherit rpm
