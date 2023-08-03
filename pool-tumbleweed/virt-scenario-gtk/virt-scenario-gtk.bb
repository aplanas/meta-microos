SUMMARY = "Gtk interface virt-scenario"
DESCRIPTION = "This is the Gtk interface for virt-scenario."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "virt-scenario-gtk-2.1.2-1.1.noarch.rpm"
RPM_HASH = "cfd2e90ae3cae6e9f158b8ae32c7c811da3b0b703568aabb78aa6c751d9d2a1069b9b9a243671f390fac032e332d2bf0b6d248448cb7ff6e91068f66e5c1f0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-scenario-gtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
virt-scenario"

inherit rpm
