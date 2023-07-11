SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-pyRXP-3.0.1-2.11.aarch64.rpm"
RPM_HASH = "7f6c12eb6efeb1380ac88a85f18659705b126f0a55b1943521925acd1002cb36a5a928de422b57a01d5a14d6fcad2d7a2761ac735f0e165d16c1f9e6a8d8a062"

RPROVIDES:${PN} += "python3.10dist-pyrxp \
python310-pyRXP \
python3dist-pyrxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
