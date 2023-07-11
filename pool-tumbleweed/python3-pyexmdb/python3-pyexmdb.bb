SUMMARY = "Python bindings for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains bindings for Python."
LICENSE = "AGPL-3.0-or-later"

PV = "1.10.4.b7a36f2"

RPM_NAME = "python3-pyexmdb-1.10.4.b7a36f2-1.2.aarch64.rpm"
RPM_HASH = "ee0ff0d428bd2190f8f32082ac3799408535407e47d8ba79e45dda666c61c7107ad714cb8ea62c47001d0f8d0403d412c8b18d2a6683acdcfedda9fecd0a9ccb"

RPROVIDES:${PN} += "python3-pyexmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexmdbpp.so.0 \
libexmdbpp0 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
