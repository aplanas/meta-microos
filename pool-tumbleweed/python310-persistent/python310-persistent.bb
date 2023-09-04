SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-persistent-5.0-3.1.aarch64.rpm"
RPM_HASH = "8e1f656bb0ee1d821712e7f2fa83326bc891d6634b9d388f528e30a1b20365e9738508936ae071a3d89c924b067df1f6f4867d2082ebf9881053855d98e2f8c3"

RPROVIDES:${PN} += "python3.10dist-persistent \
python310-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi \
python310-zope.interface"

inherit rpm
