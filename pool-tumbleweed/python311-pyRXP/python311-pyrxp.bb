SUMMARY = "Python RXP interface - fast validating XML parser"
DESCRIPTION = "PyRXP is a Python language wrapper around the excellent RXP parser, a \
validating, namespace-aware XML parser written in C."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python311-pyRXP-3.0.1-2.11.aarch64.rpm"
RPM_HASH = "971b13867025c93ac08a7d5bb2360eb42717ff53d2f1fdc2abd61b5b600d19a3354900a5e9ce81aee8975fa586a49d083366c47c8ae6944f9215575cac3d64ea"

RPROVIDES:${PN} += "python3-pyRXP \
python3.11dist-pyrxp \
python311-pyRXP \
python3dist-pyrxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
