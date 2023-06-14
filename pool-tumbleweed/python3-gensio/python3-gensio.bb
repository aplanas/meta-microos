SUMMARY = "Python bindings for libgensio"
DESCRIPTION = "Python bindings for libgensio, a library for stream and packet I/O \
abscration."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "python3-gensio-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "41a3bfdea34edc8a3bee7a0b3c3db4a67887cbe9067e9e832fc577dfcb387852b78d076229c621011a8f069544bcb98850bdd275cddb036ddcfcda215df959ec"

RPROVIDES:${PN} += "python3-gensio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgensio-python-swig.so.0 \
libgensio.so.4 \
libgensiocpp.so.4 \
libgensiomdns.so.0 \
libgensiomdnscpp.so.0 \
libgensioosh.so.0 \
libgensiooshcpp.so.0 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
