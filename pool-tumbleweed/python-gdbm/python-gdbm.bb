SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for GDBM databases. GDBM is the GNU \
implementation of the standard Unix DBM databases."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-gdbm-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "f2e2344c2e35feb4cb63f1a1290dc21321848b3ab57ac1cb65342fff0593f81432fa3fd0a5a8939bfc9eccdc50ca159fa223824ffc89865fea232fbf4fe2b098"

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
