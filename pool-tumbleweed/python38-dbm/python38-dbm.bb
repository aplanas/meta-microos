SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-dbm-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "1f408df41f62ae00126f8001234533105d6141ccd40f5f37508a74446a1b22e9b1452ea479dac07effb4f916d12b9d90f64f952333304513ded7aebbaeaa966e"

RPROVIDES:${PN} += "python38-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python38"

inherit rpm
