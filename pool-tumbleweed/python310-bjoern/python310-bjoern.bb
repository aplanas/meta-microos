SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python310-bjoern-3.2.2-1.5.aarch64.rpm"
RPM_HASH = "400005bfab3cf238dbbe32b1a61d33b4cb7567aa0f26735a2b00319e5ecc4b42c546e5f17f011fbc4224065604825df0913574a9701e516e7567b77b5d23846f"

RPROVIDES:${PN} += "python3-bjoern \
python3.10dist(bjoern) \
python310-bjoern \
python310-bjoern(aarch-64) \
python3dist(bjoern)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libev.so.4()(64bit) \
python(abi)"

inherit rpm
