SUMMARY = "Python3 bindings for FirewallD"
DESCRIPTION = "The python3 bindings for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "python3-firewall-2.0.0-1.1.noarch.rpm"
RPM_HASH = "388f388860ca7e03bf56296178d4a16052b9308895dcf53086402b0934cb03ec637c7014f592100198156075141bf6cd87cf830dc6b89983fb143138af90599f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-firewall"

RDEPENDS:${PN} += "dbus-1-python3 \
python-abi \
python3-decorator \
python3-gobject \
python3-slip-dbus \
typelib-GLib \
typelib-Gio \
typelib-NM"

inherit rpm
