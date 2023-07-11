SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python311-py-ubjson-0.16.1-1.13.aarch64.rpm"
RPM_HASH = "e712029c86ce90ae3a6e65127873c3d03e2389f768eac842924e3f043bcffc19d477efbc38ef30300a676bf06b945fa8a4809d866b50ccae59e6650eb538eeff"

RPROVIDES:${PN} += "python3-py-ubjson \
python3.11dist-py-ubjson \
python311-py-ubjson \
python3dist-py-ubjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
