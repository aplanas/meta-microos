SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for GDBM databases. GDBM is the GNU \
implementation of the standard Unix DBM databases."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-gdbm-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "9fb5f7ff2df94cc40999c051c33807607392755694095f30591f93ea3c436faf5e5ba34aa9535f0e1e9139f0071f2ff7df87c0db0472439dc1b2a70249cb3795"

RPROVIDES:${PN} += "pygdmod \
python-dbm \
python-gdbm \
python2-dbm \
python2-gdbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
libpython2.7.so.1.0 \
python-base"

inherit rpm
