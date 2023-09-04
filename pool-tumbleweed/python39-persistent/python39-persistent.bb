SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-persistent-5.0-3.1.aarch64.rpm"
RPM_HASH = "c1f0c3b2bb5c6c30e7335888e322e92d621d9c0e3eb9af08ae84507819acfec9ae1c37ed61f265ad927520870bd54f1b04fc2ac8991d91532d3cc63a3bda6a61"

RPROVIDES:${PN} += "python3.9dist-persistent \
python39-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi \
python39-zope.interface"

inherit rpm
