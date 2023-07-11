SUMMARY = "Performance Co-Pilot run-time configuration"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time configuration"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "pcp-conf-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "3b0389f1181336da0b1fb8f7b37754b0d431ea172a7d18775d37d0aacb65b1d1866adc4da8e412cd13532fb95be9de070b7dc4de0557d265adc204ff3814a792"

RPROVIDES:${PN} += "config-pcp-conf \
pcp-conf"

RDEPENDS:${PN} += ""

inherit rpm
