SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to InfluxDB"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to InfluxDB (https://influxdata.com/time-series-platform/influxdb)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2influxdb-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "a70eadc0e345124ff11464131e8a02ed210a53583be57fae39632a8195c2c98163d56ef3486171f72c258cfadae4eade2de7609ab9f3e3d896c990fbdd656a95"

RPROVIDES:${PN} += "pcp-export-pcp2influxdb"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp \
python3-requests"

inherit rpm
