SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python311-bjoern-3.2.2-1.7.aarch64.rpm"
RPM_HASH = "28f5889db34f6890ef1d62475712f2fc1ecf33e3f686cf1343f56108f3d2ebe227dabea53501520aa9a4b8276dc6701fd317e48272e12d6ab92dbf2d8ba1e1ad"

RPROVIDES:${PN} += "python3-bjoern \
python3.11dist-bjoern \
python311-bjoern \
python3dist-bjoern"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
python-abi"

inherit rpm
