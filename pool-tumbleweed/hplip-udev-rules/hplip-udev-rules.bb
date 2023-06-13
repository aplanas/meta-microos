SUMMARY = "HPLIP udev rules"
DESCRIPTION = "This package provides the udev rules required to use these devices as a normal user."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-udev-rules-3.22.10-2.1.aarch64.rpm"
RPM_HASH = "801c73f58203c5befb20376e90c5bbcc920aeceb821b0afd2732de32f3569168d713f08ea1ea69a44b64e02e8802d1548d8622d0ee2fd41979745b517d2db6b1"

RPROVIDES:${PN} += "hplip-udev-rules \
hplip-udev-rules(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
