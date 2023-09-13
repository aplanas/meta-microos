SUMMARY = "Python bindings for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains bindings for Python."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "python3-pyexmdb-1.11.0.58baa16-1.1.aarch64.rpm"
RPM_HASH = "ab63b677b3a1ba2b8f67379093787d4094dc1f9fdc6ce20edcdc014d87ee58569132748dc51477326d4f0392c784dc0fdb5f208dc06546dcfdc0bed283314578"

RPROVIDES:${PN} += "python3-pyexmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexmdbpp.so.0 \
libexmdbpp0 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
