SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24.1"

RPM_NAME = "python39-python-dbusmock-0.24.1-3.2.noarch.rpm"
RPM_HASH = "e5087719f5579d97f1bd261cab1d4611eb1998e30c9b317ba06f94eeb29f681a1b1c9333309263a6870e20235c67d9a15fec728cdb675649f063c233f785cdc4"
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
