SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-kdump-300.1-1.1.noarch.rpm"
RPM_HASH = "bd5bc377a62575c036993c7897467a9153eae41474b45ba7b1fbe7651ecb2529448a3bbe94a631ca649f35996e756e8e29b3971a43dae5febed6497b425b15e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
kexec-tools"

inherit rpm
