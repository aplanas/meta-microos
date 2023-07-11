SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-dbm-3.12.0b3-1.1.aarch64.rpm"
RPM_HASH = "978cfd02b5ca971dc7f6ea933a072073e818158913e8e3dfe7a1640d37fadde88f7f7f4a2989ddaa8b50c4ac4edcde88c57871155804d44ad7b3f539796c3fc7"

RPROVIDES:${PN} += "python312-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python312"

inherit rpm
