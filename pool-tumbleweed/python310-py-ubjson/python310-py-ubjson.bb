SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python310-py-ubjson-0.16.1-1.13.aarch64.rpm"
RPM_HASH = "d9624cdeddf9e66a86caff9512852611c9ad4856dc73676afd6a036b8f84ae494a4b04647f2661a3a742118e6e473a729fbeeb358fd24830bcf2220cc4b2a0cd"

RPROVIDES:${PN} += "python3.10dist-py-ubjson \
python310-py-ubjson \
python3dist-py-ubjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
