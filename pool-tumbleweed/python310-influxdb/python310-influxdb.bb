SUMMARY = "InfluxDB client"
DESCRIPTION = "InfluxDB-Python is a client for interacting with InfluxDB 1.x"
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-influxdb-5.3.1-2.3.aarch64.rpm"
RPM_HASH = "e1534351d478d9e386e41b892913444aa052b6a0f751241ebcebb7b2d663744264395ccf555d8be5efe93caeb9542162704fdf4a81496c2f3e8d1eb4a4bb6b53"

RPROVIDES:${PN} += "python3-influxdb \
python3.10dist(influxdb) \
python310-influxdb \
python310-influxdb(aarch-64) \
python3dist(influxdb)"

RDEPENDS:${PN} += "python(abi) \
python310-msgpack \
python310-python-dateutil \
python310-pytz \
python310-requests \
python310-six"

inherit rpm
