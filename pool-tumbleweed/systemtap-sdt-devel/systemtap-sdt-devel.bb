SUMMARY = "Static probe support tools"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the support tools for static probes."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-sdt-devel-4.9-1.2.aarch64.rpm"
RPM_HASH = "add8d9c752d30db6fd19a6040f253f4c635d189725a314163f28a3c2f35956d684155935546136de8bb54b5741ba126128c8be97761ddc80d71d879acb967bca"

RPROVIDES:${PN} += "systemtap-sdt-devel"

RDEPENDS:${PN} += "systemtap"

inherit rpm
