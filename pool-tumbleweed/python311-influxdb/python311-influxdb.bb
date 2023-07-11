SUMMARY = "InfluxDB client"
DESCRIPTION = "InfluxDB-Python is a client for interacting with InfluxDB 1.x"
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python311-influxdb-5.3.1-4.1.aarch64.rpm"
RPM_HASH = "62c8eafae65ea510ff3cadc6d52070117493b30572fee689e41f0d3c50cbda55bba4fd002eb97548a1d5a2ad3a94cb47eaf77167eade812978eab7f19dc110c7"

RPROVIDES:${PN} += "python3-influxdb \
python3.11dist-influxdb \
python311-influxdb \
python3dist-influxdb"

RDEPENDS:${PN} += "python-abi \
python311-msgpack \
python311-python-dateutil \
python311-pytz \
python311-requests"

inherit rpm
