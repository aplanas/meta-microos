SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-cbor-1.0.0-1.25.aarch64.rpm"
RPM_HASH = "4adc69f7a4275f5533e6289b74b0875dc738d23e591e462901b2fff6acbd39a96eaf0c31e01e817dd51294f78f124355ac54b2ca605ba4f5e9a023b56b1448df"

RPROVIDES:${PN} += "python3-cbor \
python3.11dist-cbor \
python311-cbor \
python3dist-cbor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-base"

inherit rpm
