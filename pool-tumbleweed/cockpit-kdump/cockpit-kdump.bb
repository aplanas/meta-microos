SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-kdump-298-2.1.noarch.rpm"
RPM_HASH = "873bcad647e929e30dbac6b45c06592c5c2a2031efeeba82bbe9d8b1631329c12916d8f69716b47d1f2dd7055961469166a8fbd7278e40bda913877928baa8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
kexec-tools"

inherit rpm
