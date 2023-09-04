SUMMARY = "Performance Co-Pilot archive tools for importing iostat data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing iostat data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-iostat2pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "f80daa01c5dcf94cce54a2a4d2009700bcc4eff936a22b856e4a3a532acbce0fc5e6655a79842fc76602588d27ec05756a7fa226b18286cfff00f9c0d754a3e5"

RPROVIDES:${PN} += "pcp-import-iostat2pcp"

RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport \
sysstat"

inherit rpm
