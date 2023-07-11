SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.6.2"

RPM_NAME = "python311-autobahn-23.6.2-1.1.aarch64.rpm"
RPM_HASH = "93645f53d1572857ac13e9bfae892e29b9528390e4d39d27fc92e56cb270d767a32825470148b3de4624b70725ef3b3a89ca13ae014dbbf31c43387b54ce08cd"

RPROVIDES:${PN} += "python3-autobahn \
python3.11dist-autobahn \
python311-autobahn \
python3dist-autobahn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-PyNaCl \
python311-Twisted \
python311-argon2-cffi \
python311-attrs \
python311-cbor2 \
python311-cffi \
python311-flatbuffers \
python311-hyperlink \
python311-msgpack \
python311-passlib \
python311-py-ubjson \
python311-pyOpenSSL \
python311-pytrie \
python311-service-identity \
python311-txaio \
python311-ujson \
python311-wsaccel \
python311-zope.interface \
update-alternatives"

inherit rpm
