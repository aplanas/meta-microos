SUMMARY = "Performance Co-Pilot archive tools for importing MTRG data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing MTRG data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-mrtg2pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "e49d2eb666ed4e51444dec2df1d0c76f42cc317a810b2b1197604bc394268b26cc8ea5781bb305dd771eb0319f806446d1f4797576dd399727d5bf42d8e77c17"

RPROVIDES:${PN} += "pcp-import-mrtg2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport"

inherit rpm
