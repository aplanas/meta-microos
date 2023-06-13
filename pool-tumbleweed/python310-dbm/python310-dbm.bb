SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-dbm-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "21ee0e7c535c2270ddc6e1b1ab50b609c4474ca20aa4ccf6c280b50569a34093e5fdc10eaae00dbc1eda6a8cb168ff29cc3af0f9a6edef9c3fadc31174fe95f6"

RPROVIDES:${PN} += "python3-dbm \
python310-dbm \
python310-dbm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdbm.so.6()(64bit) \
libgdbm_compat.so.4()(64bit) \
python(abi) \
python310"

inherit rpm
