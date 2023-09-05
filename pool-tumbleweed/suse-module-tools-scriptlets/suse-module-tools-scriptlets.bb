SUMMARY = "Kernel rpm scriptlets"
DESCRIPTION = "Scripts called by the SUSE kernel packages on installation"
LICENSE = "GPL-2.0-or-later"

PV = "16.0.34"

RPM_NAME = "suse-module-tools-scriptlets-16.0.34-1.1.aarch64.rpm"
RPM_HASH = "809d1a4b67fcc811a7fe2c7a61b60243cd7907680f7fd30db51e5eef772009d6464fa37688020ed17a1724a90d4b887fc20880428c17127bb6bafac4fd24fbf5"

RPROVIDES:${PN} += "suse-kernel-rpm-scriptlets \
suse-module-tools-/usr/lib/module-init-tools/kernel-scriptlets \
suse-module-tools-scriptlets"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
suse-module-tools"

inherit rpm
