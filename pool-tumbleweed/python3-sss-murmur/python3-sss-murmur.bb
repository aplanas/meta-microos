SUMMARY = "Python3 bindings for SSSD Murmur hash function"
DESCRIPTION = "This subpackage provides the python3 module for calculating the \
Murmur hash version 3."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "python3-sss-murmur-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "bf3ede9c947fe9a1dd7f387e186ee8e52016eb2c62ee1a27e55fd4c6a656209e87004fd1302be618a9e1ea0dbf63bbd44f30a0aa788a14a481b092ebfdebca89"

RPROVIDES:${PN} += "python3-sss-murmur"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
