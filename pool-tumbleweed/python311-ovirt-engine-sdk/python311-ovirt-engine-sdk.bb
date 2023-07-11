SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python311-ovirt-engine-sdk-4.4.9-1.15.aarch64.rpm"
RPM_HASH = "bd2c5b199538e72369dda3a6d078d21b151512310a7fb9ac192cc6f24b4934a2abe0242b0fc3f448102c702f54434eb0dfceef9507185c66fcbc7dbcb56c0fbd"

RPROVIDES:${PN} += "python3-ovirt-engine-sdk \
python3.11dist-ovirt-engine-sdk-python \
python311-ovirt-engine-sdk \
python3dist-ovirt-engine-sdk-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
python-abi \
python311-pycurl \
python311-six"

inherit rpm
