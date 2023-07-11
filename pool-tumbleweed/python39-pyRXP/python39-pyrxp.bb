SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python39-pyRXP-3.0.1-2.11.aarch64.rpm"
RPM_HASH = "6b429d9817efd366ae1d37abf6178aa43e034948f6a057a6b80e318de953240684d60861ba3162e8d409521d967b2405af87404d0ea1eaa84215839751ea1505"

RPROVIDES:${PN} += "python3.9dist-pyrxp \
python39-pyRXP \
python3dist-pyrxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
