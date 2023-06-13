SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python39-py-ubjson-0.16.1-1.11.aarch64.rpm"
RPM_HASH = "2705eb2935e3e0da9d506f7ddc3a4baf09783b1e7d602c0ce986fb0d4095e7f2ab9c74886361c890c385cbbaf5fae9c3455573642b792afa78af43213941c4d3"

RPROVIDES:${PN} += "python3.9dist(py-ubjson) \
python39-py-ubjson \
python39-py-ubjson(aarch-64) \
python3dist(py-ubjson)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
