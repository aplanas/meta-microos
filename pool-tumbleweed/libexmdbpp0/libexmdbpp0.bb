SUMMARY = "A C++ implementation of the exmdb wire protocol"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server."
LICENSE = "AGPL-3.0-or-later"

PV = "1.10.4.b7a36f2"

RPM_NAME = "libexmdbpp0-1.10.4.b7a36f2-1.2.aarch64.rpm"
RPM_HASH = "3e6e405c6dcf6bddc85a8a90fbab0cedece7b763814db04790f57a56f4fcd8e1d0f19c4fb042d1a073deedb1d6e577e69466e645fe317beba785700dd6d5c203"

RPROVIDES:${PN} += "libexmdbpp.so.0 \
libexmdbpp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
