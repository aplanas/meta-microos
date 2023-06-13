SUMMARY = "Python bindings for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains bindings for Python."
LICENSE = "AGPL-3.0-or-later"

PV = "1.10.4.b7a36f2"

RPM_NAME = "python3-pyexmdb-1.10.4.b7a36f2-1.1.aarch64.rpm"
RPM_HASH = "766d2de6a21fd3e2691da58731d16dc4770f5be968bf0a35cf27ae504fddac2c27a74806486de4e130cacec6fcb17c5acc44fc419b1ba50a29e67118c66d70f7"

RPROVIDES:${PN} += "python3-pyexmdb \
python3-pyexmdb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexmdbpp.so.0()(64bit) \
libexmdbpp0 \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
