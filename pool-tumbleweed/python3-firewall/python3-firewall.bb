SUMMARY = "Python3 bindings for FirewallD"
DESCRIPTION = "The python3 bindings for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "python3-firewall-2.0.0-2.1.noarch.rpm"
RPM_HASH = "f27d7b3ab029e7f423894879bf440c5604a29417b7622ff7542a7ef689bc224775eb4d186575454fe0e382f3532947af8e8e44d8ec52782676bf6c274bdeb15a"
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
