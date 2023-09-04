SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to InfluxDB"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to InfluxDB (https://influxdata.com/time-series-platform/influxdb)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2influxdb-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "ec97061d7b87659fa0a20d78685883af6f3a922d9b095fd94bb4847a2099d058f270eea8665e8d1e2006775197b80a1da4471a6fae939ad025b8aafb6d51dcba"

RPROVIDES:${PN} += "pcp-export-pcp2influxdb"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp \
python3-requests"

inherit rpm
