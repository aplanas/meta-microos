SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-dbm-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "ecea08c03c0549539ec288e04c76d93d25c7795a271c0174c39afd1cffa6f1e3dc6250e7d6ffd68de1e04ae1fb895a8b0bf93b8bf7aa253b8b682f07bb00e36e"

RPROVIDES:${PN} += "python39-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python39"

inherit rpm
