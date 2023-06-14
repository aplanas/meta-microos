SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "22.7.1"

RPM_NAME = "python310-autobahn-22.7.1-1.5.aarch64.rpm"
RPM_HASH = "65a78a921debd3b5e8d2ed5b1acba3c473b364e9b527b839f3bd385cb45df02491cee6e70ac258aa340fce693c9e41f1101f82f2a0ac3393fcbc5c690012832d"

RPROVIDES:${PN} += "python3-autobahn \
python3.10dist-autobahn \
python310-autobahn \
python3dist-autobahn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-PyNaCl \
python310-PyQRCode \
python310-Twisted \
python310-argon2-cffi \
python310-attrs \
python310-cbor \
python310-cbor2 \
python310-cffi \
python310-flatbuffers \
python310-hyperlink \
python310-lz4 \
python310-msgpack \
python310-passlib \
python310-py-ubjson \
python310-pyOpenSSL \
python310-pytrie \
python310-service-identity \
python310-txaio \
python310-ujson \
python310-wsaccel \
python310-zope.interface \
update-alternatives"

inherit rpm
