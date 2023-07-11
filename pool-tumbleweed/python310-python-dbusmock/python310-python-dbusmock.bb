SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24.1"

RPM_NAME = "python310-python-dbusmock-0.24.1-3.2.noarch.rpm"
RPM_HASH = "077c03312d01741e01eb34d1c0183c78f2f4cc62a4bafc91f963e07b31aec6385caf469044b42d8c3d2bcf0a2542b313a944b7e45856467598f148e0208bf1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-dbusmock \
python310-dbusmock \
python310-python-dbusmock \
python3dist-python-dbusmock"

RDEPENDS:${PN} += "dbus-1-x11 \
python-abi \
python310-dbus-python \
python310-gobject \
typelib-GLib"

inherit rpm
