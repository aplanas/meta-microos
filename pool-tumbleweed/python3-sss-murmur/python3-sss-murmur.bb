SUMMARY = "Python3 bindings for SSSD Murmur hash function"
DESCRIPTION = "This subpackage provides the python3 module for calculating the \
Murmur hash version 3."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "python3-sss-murmur-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "f0d1be3730414ccfc55f95b694e7cfac8d09617ce89ea0c6b831972906db164ca5f2eec6d3f16849e23c38c71a8bafa2a324ebbbb6a2e135fdcb22cbc9ec1614"

RPROVIDES:${PN} += "python3-sss-murmur"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
