SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-dbm-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "525ee1664a5eeb260fd73cad9e6594a5edbd2a3a1a7544ea922a9673a00beedbba0b391228ca129548a320c936e20d776fbed41c00e8f59013ab39b617995350"

RPROVIDES:${PN} += "python312-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python312"

inherit rpm
