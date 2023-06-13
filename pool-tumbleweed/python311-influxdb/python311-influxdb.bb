SUMMARY = "InfluxDB client"
DESCRIPTION = "InfluxDB-Python is a client for interacting with InfluxDB 1.x"
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-influxdb-5.3.1-2.3.aarch64.rpm"
RPM_HASH = "1be5c584f6a665f65cc9654de14157b37b525c8f4a153432c49efe8c05c68ce72f791f42da334702c599cb4f671500b8e8bd6efaec38b77f1c967577d577b2cb"

RPROVIDES:${PN} += "python3.11dist(influxdb) \
python311-influxdb \
python311-influxdb(aarch-64) \
python3dist(influxdb)"

RDEPENDS:${PN} += "python(abi) \
python311-msgpack \
python311-python-dateutil \
python311-pytz \
python311-requests \
python311-six"

inherit rpm
