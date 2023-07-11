SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.6.2"

RPM_NAME = "python39-autobahn-23.6.2-1.1.aarch64.rpm"
RPM_HASH = "863f12f7c7e92600c94cfe3bb60f66379694bade9848e709cec160300d714c7dd0292db255d26ad41cc84a6615ba3b2d32a54b58f69eb7bbc4b4af1277ec1fbe"

RPROVIDES:${PN} += "python3.9dist-autobahn \
python39-autobahn \
python3dist-autobahn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-PyNaCl \
python39-Twisted \
python39-argon2-cffi \
python39-attrs \
python39-cbor2 \
python39-cffi \
python39-flatbuffers \
python39-hyperlink \
python39-msgpack \
python39-passlib \
python39-py-ubjson \
python39-pyOpenSSL \
python39-pytrie \
python39-service-identity \
python39-txaio \
python39-ujson \
python39-wsaccel \
python39-zope.interface \
update-alternatives"

inherit rpm
