SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-dbm-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "f7e8db6aecbe1ab89e8a3d4b04a84d0943dedcc312d62e27b19c179bac04dd589be46edc8c9eda3739038f077f0c076bdaf652e51ae0ddd2a5c113c5334fb55d"

RPROVIDES:${PN} += "python3-dbm \
python311-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python311"

inherit rpm
