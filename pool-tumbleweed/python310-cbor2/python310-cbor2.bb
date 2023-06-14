SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "python310-cbor2-5.4.6-1.5.aarch64.rpm"
RPM_HASH = "9e3ae56a5e4fc4270ffebb5de4fb00b00e788231090cc8060acfa9adc1989d5aacde83b76b0deeed1120556ffc37e9918bb116acf754d3512227309832952db7"

RPROVIDES:${PN} += "python3-cbor2 \
python3.10dist-cbor2 \
python310-cbor2 \
python3dist-cbor2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
