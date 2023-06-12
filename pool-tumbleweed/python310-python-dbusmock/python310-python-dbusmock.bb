SUMMARY = "Python library for creating mock D-Bus objects"
DESCRIPTION = "With this program/Python library, one can create mock objects on D-Bus. \
This is useful for writing tests for software which talks to D-Bus services \
such as upower, systemd, logind, gnome-session or others, and it is hard \
(or impossible without root privileges) to set the state of the real services \
to what one may expect in tests."
LICENSE = "LGPL-3.0-or-later"

PV = "0.24.1"

RPM_NAME = "python310-python-dbusmock-0.24.1-3.1.noarch.rpm"
RPM_HASH = "56e4d156b2bf7eaba452c074a39bc12fc4ba9594d27e557e8e071d65974328b71130d24d11ab564fddd267263c9ad3036ddcde6a3f9816624ada7a49e2453b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbusmock \
python3-python-dbusmock \
python3.10dist(python-dbusmock) \
python310-dbusmock \
python310-python-dbusmock \
python3dist(python-dbusmock)"
RDEPENDS:${PN} += "dbus-1-x11 \
python(abi) \
python310-dbus-python \
python310-gobject \
typelib(GLib)"

inherit rpm
