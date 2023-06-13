SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for GDBM databases. GDBM is the GNU \
implementation of the standard Unix DBM databases."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-gdbm-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "71362251ffa226686d99edc8f14922f5a9690efaeb0c80bbb32229937287ddf2085d4427d68bc827f7e41fa718ef2eb2e54469adeba53e7d2bfcc3ae484730d8"

RPROVIDES:${PN} += "pygdmod \
python-dbm \
python-gdbm \
python-gdbm(aarch-64) \
python2-dbm \
python2-gdbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdbm.so.6()(64bit) \
libgdbm_compat.so.4()(64bit) \
libpython2.7.so.1.0()(64bit) \
python-base"

inherit rpm
