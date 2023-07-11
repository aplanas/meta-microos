SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python310-ovirt-engine-sdk-4.4.9-1.15.aarch64.rpm"
RPM_HASH = "d00df2bcb742330b3b5ed6129723ff1701e4cb635cab603e503a43c396e6d4cf8c1a73ce5cc824186cde1bb78909ca582a5a13ad57625f413d73302b38406dc4"

RPROVIDES:${PN} += "python3.10dist-ovirt-engine-sdk-python \
python310-ovirt-engine-sdk \
python3dist-ovirt-engine-sdk-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
python-abi \
python310-pycurl \
python310-six"

inherit rpm
