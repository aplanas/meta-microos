SUMMARY = "InfluxDB client"
DESCRIPTION = "InfluxDB-Python is a client for interacting with InfluxDB 1.x"
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python310-influxdb-5.3.1-4.1.aarch64.rpm"
RPM_HASH = "fe3711c1cb3c5a286a0e7e1a25bff406683dffda3c5d5f3aee6eb2675405f6945d47a02f1ca23b10d3320f63f69675d1030206e3012e9361a9c93c976d5f7bde"

RPROVIDES:${PN} += "python3.10dist-influxdb \
python310-influxdb \
python3dist-influxdb"

RDEPENDS:${PN} += "python-abi \
python310-msgpack \
python310-python-dateutil \
python310-pytz \
python310-requests"

inherit rpm
