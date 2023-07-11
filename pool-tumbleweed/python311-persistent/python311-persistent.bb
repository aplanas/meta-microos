SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-persistent-5.0-2.3.aarch64.rpm"
RPM_HASH = "9c50742db91767ce519c8becff4d908a18ca9bf3c0c8776498caf235ea078ac5b4382719841875859a2928641822e6693516c48579854862771fe905ed144317"

RPROVIDES:${PN} += "python3-persistent \
python3.11dist-persistent \
python311-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi \
python311-zope.interface"

inherit rpm
