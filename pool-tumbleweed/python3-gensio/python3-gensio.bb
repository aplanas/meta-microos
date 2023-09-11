SUMMARY = "Python bindings for libgensio"
DESCRIPTION = "Python bindings for libgensio, a library for stream and packet I/O \
abscration."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.7.5"

RPM_NAME = "python3-gensio-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "521b7b3e03b9c4d1ed129081ee7f8144a31282e37027d5360ed9c8779bf2d2128878c0fa19c845a89246029ba0006fda3b26d5f421ba1984ce886b39c9d01cba"

RPROVIDES:${PN} += "python3-gensio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgensio-python-swig.so.6 \
libgensio.so.6 \
libgensiocpp.so.6 \
libgensiomdns.so.6 \
libgensiomdnscpp.so.6 \
libgensioosh.so.6 \
libgensiooshcpp.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
