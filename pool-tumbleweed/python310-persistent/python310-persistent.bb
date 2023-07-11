SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-persistent-5.0-2.3.aarch64.rpm"
RPM_HASH = "4cf55b4281eef4639e62bac25ef2dd295e8c9ce8b9bb7533e135bd7525c84ba5577b1aa6a1f47daa971fa99c56bc8750c6db167c190fc4295c7c62b1e48563b0"

RPROVIDES:${PN} += "python3.10dist-persistent \
python310-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi \
python310-zope.interface"

inherit rpm
