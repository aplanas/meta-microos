SUMMARY = "InfluxDB development files"
DESCRIPTION = "Go sources and other development files for InfluxDB"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "influxdb-devel-1.11.0-1.2.aarch64.rpm"
RPM_HASH = "8bee99767051b8ba8f92b3746063159736f78be8bb077564c5464d16d7339a2617101711b60cbe36743efab1c8872a04712f48187a26383dafd6e3bcf346804d"

RPROVIDES:${PN} += "influxdb-devel \
influxdb-devel(aarch-64)"
RDEPENDS:${PN} += "go"

inherit rpm
