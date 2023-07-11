SUMMARY = "SystemTap headers"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains only the headers for static system probes and \
exists only to limit build cycles.  Normally you should install \
systemtap-sdt-devel, which also contains these headers."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-headers-4.9-1.2.aarch64.rpm"
RPM_HASH = "1c5da450851db51030f0f5f0fe301be897a0791b0b437dc90ce74ee2b0456db98bc53692d81d36d75e5e9b09aa7a6d75adffda6ce2825c19e98bd89c508fa98c"

RPROVIDES:${PN} += "systemtap-headers"

RDEPENDS:${PN} += ""

inherit rpm
