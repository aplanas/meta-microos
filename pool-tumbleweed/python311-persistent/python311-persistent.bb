SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-persistent-5.0-3.1.aarch64.rpm"
RPM_HASH = "381f7da22bef994d5b7f302a585cb322b09035a5bfa2008e173eac3d25d75bbbeb76b14a82c0b85252860ca5eddf691be8a3f68b4eaaa411b638ff060acad99e"

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
