SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.3"

RPM_NAME = "python311-pyfuse3-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "130ec730c794c81b9bdaad3a73fc405d77c2f9a655c0b66e8680f591156ebeb1214a61a69a1bfdbdb8948a2c3351d21071ba9ec2e78fe2459d7d157b97000985"

RPROVIDES:${PN} += "python3.11dist(pyfuse3) \
python311-pyfuse3 \
python311-pyfuse3(aarch-64) \
python3dist(pyfuse3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuse3.so.3()(64bit) \
python(abi) \
python311-trio"

inherit rpm
