SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-doc-253.4-2.1.aarch64.rpm"
RPM_HASH = "e766d8e4f00464b276efc14d839f98cd26c61dc6b9f10e6c03b85ca65666c023df34823eb83588e7fc1e144b66ac0908af0a2190d4420692456b6b100593500e"

RPROVIDES:${PN} += "systemd-doc \
systemd-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
