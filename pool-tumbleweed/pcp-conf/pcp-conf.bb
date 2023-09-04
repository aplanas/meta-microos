SUMMARY = "Performance Co-Pilot run-time configuration"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time configuration"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "pcp-conf-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "60fdff0f8c54c3b7ab00518c35e905fa247fe20504256eec1678c637ea6b9dfc5544c7e33470fc413fe6348cd6afb45e18fc6c7566aa94a9373cf122e4956e30"

RPROVIDES:${PN} += "config-pcp-conf \
pcp-conf"

RDEPENDS:${PN} += ""

inherit rpm
