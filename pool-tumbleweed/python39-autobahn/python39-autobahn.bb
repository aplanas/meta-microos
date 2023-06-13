SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "22.7.1"

RPM_NAME = "python39-autobahn-22.7.1-1.5.aarch64.rpm"
RPM_HASH = "e810d6160077cc547ecf3b0d00dede4be0e06c56f033c3fd0136934005a37f8c09129cc585719dbf18c3994ab05f912dd2289a522f83bef6d5aeb3ceff2c2244"

RPROVIDES:${PN} += "python3.9dist(autobahn) \
python39-autobahn \
python39-autobahn(aarch-64) \
python3dist(autobahn)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyNaCl \
python39-PyQRCode \
python39-Twisted \
python39-argon2-cffi \
python39-attrs \
python39-cbor \
python39-cbor2 \
python39-cffi \
python39-flatbuffers \
python39-hyperlink \
python39-lz4 \
python39-msgpack \
python39-passlib \
python39-py-ubjson \
python39-pyOpenSSL \
python39-pytrie \
python39-service_identity \
python39-txaio \
python39-ujson \
python39-wsaccel \
python39-zope.interface \
update-alternatives"

inherit rpm
