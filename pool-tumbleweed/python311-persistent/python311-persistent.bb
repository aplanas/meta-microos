SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-persistent-5.0-1.4.aarch64.rpm"
RPM_HASH = "6d1544cedf58de9899ee9b47a2926c664deb2d6ddb44c2e735d3099707100b5fdb9432db1ad1663c7bff599058acb0cc00921471b1d8edf83a3883c432bc94c0"

RPROVIDES:${PN} += "python3.11dist-persistent \
python311-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-cffi \
python311-zope.interface"

inherit rpm
