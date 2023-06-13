SUMMARY = "Static probe support tools"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the support tools for static probes."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-sdt-devel-4.9-1.1.aarch64.rpm"
RPM_HASH = "fd86012dbec35579880f2797b6dd627e067767fd05a8048d3ae943a0acb5ad79072826c32aee8844b8befe393e29b80d6f90a7ed6ea1523a25619900f47f6f5b"

RPROVIDES:${PN} += "systemtap-sdt-devel \
systemtap-sdt-devel(aarch-64)"

RDEPENDS:${PN} += "systemtap"

inherit rpm
