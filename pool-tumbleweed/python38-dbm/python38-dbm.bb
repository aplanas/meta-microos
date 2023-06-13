SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-dbm-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "7d6e08c662c83408b49fa7cc99a981e0ac88b9a9200de0354ab7f1e57babb053642840d0d6a5451393489a0c22fbfd9ee847743395e94ed4d4846ddc1717b384"

RPROVIDES:${PN} += "python38-dbm \
python38-dbm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdbm.so.6()(64bit) \
libgdbm_compat.so.4()(64bit) \
python(abi) \
python38"

inherit rpm
