SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-persistent-5.0-2.3.aarch64.rpm"
RPM_HASH = "f110a6f7afc28cc2bc318208cd8a5416d5acd4c34758a6efe007acdfd71e2ae3f26299aa4e31b1b8eb87ad336fe2a710e2e2bef324ee52ef08aaf927172f171e"

RPROVIDES:${PN} += "python3.9dist-persistent \
python39-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi \
python39-zope.interface"

inherit rpm
