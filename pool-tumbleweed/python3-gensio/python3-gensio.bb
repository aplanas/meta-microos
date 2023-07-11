SUMMARY = "Python bindings for libgensio"
DESCRIPTION = "Python bindings for libgensio, a library for stream and packet I/O \
abscration."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "python3-gensio-2.6.1-1.6.aarch64.rpm"
RPM_HASH = "5e918cc5c612dda493fa5a728fa6e9ddfd95bb8ab3b4451d1bf2845d299149df4377bb548a7e36c28bdc4e6fa047b143f7efb7a0cd27469d3eb2f3a4b40ef347"

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
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
