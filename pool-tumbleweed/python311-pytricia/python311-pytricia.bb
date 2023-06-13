SUMMARY = "A library for IP address lookup in Python"
DESCRIPTION = "Pytricia is a python module to store IP prefixes in a patricia tree. \
It's based on Dave Plonka's modified patricia tree code, and has three things \
to recommend it over related modules (including py-radix and SubnetTree)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-pytricia-1.0.2-3.12.aarch64.rpm"
RPM_HASH = "a0da6991e582e6905abd5c3414a6492deb513c96b9be9ff5681a80eb7983409fc3e5abbea6a806cf03468d6f4e1a7b890ad9a34a161ecad06381631a7122ec0f"

RPROVIDES:${PN} += "python3.11dist(pytricia) \
python311-pytricia \
python311-pytricia(aarch-64) \
python3dist(pytricia)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
