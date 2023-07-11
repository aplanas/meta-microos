SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "python39-cbor2-5.4.6-2.3.aarch64.rpm"
RPM_HASH = "78f74b0e1fd9a29800cfa4d11e666272883b8dfbdf92900c9176f0d7bd62984c6f46ab875db4564d0e2020317877370fc55c1bce640e5487e705a14c12b67e60"

RPROVIDES:${PN} += "python3.9dist-cbor2 \
python39-cbor2 \
python3dist-cbor2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
