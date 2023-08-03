SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-dbm-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "c5930f89f5afc4b545db2b0c760a9a088364eb4924f6350272328b028eda234a1018c597a7b86f0f8b09d90ed4abcd4cd0917b03f0699cbf5165f9f214810205"

RPROVIDES:${PN} += "python310-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python310"

inherit rpm
