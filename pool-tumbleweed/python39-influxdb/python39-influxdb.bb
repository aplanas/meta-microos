SUMMARY = "InfluxDB client"
DESCRIPTION = "InfluxDB-Python is a client for interacting with InfluxDB 1.x"
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python39-influxdb-5.3.1-4.1.aarch64.rpm"
RPM_HASH = "b0bff5b8ae3f6007f497993473605bd0995a836795e834d37b7a9ef6020a7edcb984b130825f340eff554b84279cd4a9227e19fd65d0325aa28b470ba60af535"

RPROVIDES:${PN} += "python3.9dist-influxdb \
python39-influxdb \
python3dist-influxdb"

RDEPENDS:${PN} += "python-abi \
python39-msgpack \
python39-python-dateutil \
python39-pytz \
python39-requests"

inherit rpm
