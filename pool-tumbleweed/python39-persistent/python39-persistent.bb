SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-persistent-5.0-1.4.aarch64.rpm"
RPM_HASH = "cd260e6a53986d9546ac071bc4c8b526ed3f03aeab45577bfdc8c036cce4cc018920731a6cbe757d9a094ba0d7c5de6e968a620e4f920e377013c08b43aa1bea"

RPROVIDES:${PN} += "python3.9dist-persistent \
python39-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-cffi \
python39-zope.interface"

inherit rpm
