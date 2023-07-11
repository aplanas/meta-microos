SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-dbm-3.11.4-1.1.aarch64.rpm"
RPM_HASH = "e52169d4fe380f29e816981b82f7c4be7620ff487a85d1512a5353552772a5816e07ea8550019f1b10934fb8831093a9bfe605a3b3b0231c45f383794f813fbf"

RPROVIDES:${PN} += "python3-dbm \
python311-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python311"

inherit rpm
