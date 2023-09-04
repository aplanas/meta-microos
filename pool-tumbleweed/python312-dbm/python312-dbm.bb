SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-dbm-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "e84ca450f415443623e7f3caa25b1bae2402253f9c023b88ece4b87ef7a27ff32724d7307c19eecdef2d14087d4544d94ac647d431fd209f09fb670c870e880f"

RPROVIDES:${PN} += "python312-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python312"

inherit rpm
