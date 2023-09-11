SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-dbm-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "e3d7e1d254fb1a056170c6a00c13bb8afb235f49020697fd39f47a0939947ed8c3a3bd0ee10f0da694f4110b124902a771ac86d2e9c7f5e49061380ca1050e66"

RPROVIDES:${PN} += "python310-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python310"

inherit rpm
