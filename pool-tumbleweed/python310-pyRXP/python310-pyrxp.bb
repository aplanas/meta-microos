SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python310-pyRXP-3.0.1-2.9.aarch64.rpm"
RPM_HASH = "61bbdcd73542ed0329455d14529165c7ef6d290f4cfd8bb609eb91299f8b4ba1f797877fb8f202237fd75ca8c91aed3f1d23304f839183a69a09c8279d643ad5"

RPROVIDES:${PN} += "python3-pyRXP \
python3.10dist(pyrxp) \
python310-pyRXP \
python310-pyRXP(aarch-64) \
python3dist(pyrxp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
