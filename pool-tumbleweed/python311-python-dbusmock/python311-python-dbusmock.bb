SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24.1"

RPM_NAME = "python311-python-dbusmock-0.24.1-3.2.noarch.rpm"
RPM_HASH = "3cdebaf5530a08e101121299f000b87c3bb4e3d41f7cfa2a4f1ce8730cba61352275b7e009bcfac2a39fdec4a5147ad52b469127e72cb60e8632cebbf5356971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbusmock \
python3-python-dbusmock \
python3.11dist-python-dbusmock \
python311-dbusmock \
python311-python-dbusmock \
python3dist-python-dbusmock"

RDEPENDS:${PN} += "dbus-1-x11 \
python-abi \
python311-dbus-python \
python311-gobject \
typelib-GLib"

inherit rpm
