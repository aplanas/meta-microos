SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-dbm-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "561f04a905a8609cece14ce7909695ea113b2914fa58e86b2cfd712a800390e1dfc85d494da6925059ad938fdabe9c40ff7c0afbad0e772298a3e1ae792bf621"

RPROVIDES:${PN} += "python310-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python310"

inherit rpm
