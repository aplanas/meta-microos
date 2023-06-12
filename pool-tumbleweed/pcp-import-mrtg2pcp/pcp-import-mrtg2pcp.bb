SUMMARY = "Performance Co-Pilot archive tools for importing MTRG data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing MTRG data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-mrtg2pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "dd04847bfad8c8d83c7d71b285c971f8b6cd2154b54ae0acc621c0f7a48c126e818d28826167579c8b2eb18cf62711c2f2cd6e79278698adc257f65102ba0d22"

RPROVIDES:${PN} += "pcp-import-mrtg2pcp \
pcp-import-mrtg2pcp(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport"

inherit rpm
