SUMMARY = "Gtk interface virt-scenario"
DESCRIPTION = "This is the Gtk interface for virt-scenario."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "virt-scenario-gtk-2.1.1-1.1.noarch.rpm"
RPM_HASH = "d750167eddde5364cf2564b7cce21b79100fdba353c08a47df3d1e4f72d2e16d08d128ed7d3680f0fca3aab968cb1a5578d4dacf1060ff0c44c7291ba0815f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-scenario-gtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
virt-scenario"

inherit rpm
