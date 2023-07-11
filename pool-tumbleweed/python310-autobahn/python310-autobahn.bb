SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "23.6.2"

RPM_NAME = "python310-autobahn-23.6.2-1.1.aarch64.rpm"
RPM_HASH = "cf9475dc17fb7c30099cb07cef5aece88164078cc2d2315038b98f73f5d96976959739797e9a9c40b6905cf66ef3de6f7c7323078d21c3e79d381bd63f25ba59"

RPROVIDES:${PN} += "python3.10dist-autobahn \
python310-autobahn \
python3dist-autobahn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-PyNaCl \
python310-Twisted \
python310-argon2-cffi \
python310-attrs \
python310-cbor2 \
python310-cffi \
python310-flatbuffers \
python310-hyperlink \
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
