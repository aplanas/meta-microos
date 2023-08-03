SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-dbm-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "86b5ee0b633bfa3b5075bcc01e117e5769b8c3d91f3b746ac228ef6c9099235143a5b6dfd81f27107c1813510e074bd85df87621169ef8b8f09741592193d2b3"

RPROVIDES:${PN} += "python39-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python39"

inherit rpm
