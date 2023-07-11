SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "python310-cbor2-5.4.6-2.3.aarch64.rpm"
RPM_HASH = "369ac8ccebae641ecf0801f1d7fcf4ea7513261787b2b4ca12da7251b63a31066688f1289addf8a06ec2363c95922665c82a62f190744d3dc885b0c30f8547e5"

RPROVIDES:${PN} += "python3.10dist-cbor2 \
python310-cbor2 \
python3dist-cbor2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
