SUMMARY = "A library for IP address lookup in Python"
DESCRIPTION = "Pytricia is a python module to store IP prefixes in a patricia tree. \
It's based on Dave Plonka's modified patricia tree code, and has three things \
to recommend it over related modules (including py-radix and SubnetTree)."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-pytricia-1.0.2-3.12.aarch64.rpm"
RPM_HASH = "93d50710e541551be9653d181e19f1739ac3ae0edc4e1c6a5ed3c71e8b9a7b914d2292d8919d78807fbab7da59b1b2e7b1b4c4c23877c946bcb41b607a168531"

RPROVIDES:${PN} += "python3-pytricia \
python3.10dist(pytricia) \
python310-pytricia \
python310-pytricia(aarch-64) \
python3dist(pytricia)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
