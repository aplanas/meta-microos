SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-dbm-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "19e9c480cc498142173e01c15c4a340aad29a21b2baaf6a377cd494931fe9b310370a22696451d7133dc6736f03dd8b3598817e7cf8e12262e0af2cddd729fa7"

RPROVIDES:${PN} += "python312-dbm \
python312-dbm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdbm.so.6()(64bit) \
libgdbm_compat.so.4()(64bit) \
python(abi) \
python312"

inherit rpm
