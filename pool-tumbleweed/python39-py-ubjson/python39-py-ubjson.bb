SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python39-py-ubjson-0.16.1-1.13.aarch64.rpm"
RPM_HASH = "cb42e7a3b1e94f5e1f3b5e6773953e9313f52526e9f416d1adde3a27409417ef0abec1d1953ece9950b0888dad499e6c95e9c028e1358a56e9277ef9d0e1d0d4"

RPROVIDES:${PN} += "python3.9dist-py-ubjson \
python39-py-ubjson \
python3dist-py-ubjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
