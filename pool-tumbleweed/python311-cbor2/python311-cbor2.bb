SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "python311-cbor2-5.4.6-2.3.aarch64.rpm"
RPM_HASH = "4217d69ddd61876fde0c5a920d85fb1a6b6d89de74327d68b62784082b0c49d9babf93ceb7abea130ef6158f58c712cf270f1d09738b39c8eabe45debd8dbd07"

RPROVIDES:${PN} += "python3-cbor2 \
python3.11dist-cbor2 \
python311-cbor2 \
python3dist-cbor2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
