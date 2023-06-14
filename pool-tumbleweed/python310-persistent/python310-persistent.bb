SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-persistent-5.0-1.4.aarch64.rpm"
RPM_HASH = "0edd276b2c6bac31cae6fe59778f579d4cbb4751913fd5ccaafc8a693c8fbf7e91322be9495e68ae4aadc480a45eebb1e2776bbc655a300702d8c81c67488709"

RPROVIDES:${PN} += "python3-persistent \
python3.10dist-persistent \
python310-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi \
python310-zope.interface"

inherit rpm
