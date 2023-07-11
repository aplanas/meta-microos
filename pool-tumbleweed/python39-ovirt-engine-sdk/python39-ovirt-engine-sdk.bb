SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python39-ovirt-engine-sdk-4.4.9-1.15.aarch64.rpm"
RPM_HASH = "afd45d3225c672d13dc99995a273d4b881a1a6be042acb4eb179fe3a91f646226e3081eb0d67148bd793b8402f546f6f37c176ad347819ac3d20e3df1542a7f5"

RPROVIDES:${PN} += "python3.9dist-ovirt-engine-sdk-python \
python39-ovirt-engine-sdk \
python3dist-ovirt-engine-sdk-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
python-abi \
python39-pycurl \
python39-six"

inherit rpm
