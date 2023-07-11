SUMMARY = "Performance Co-Pilot (PCP) metrics for Simple Network Management Protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about SNMP."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-snmp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "7ccb38bbb86b478041aa0df5d37927fe772fd36b496b77d95b6108f9081c9f7e755e685aa10886d2efb19207745d80938d1eed17986fe758b897aa5974de6d27"

RPROVIDES:${PN} += "pcp-pmda-snmp"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-Net--SNMP \
perl-PCP-PMDA"

inherit rpm
