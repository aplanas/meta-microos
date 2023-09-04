SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-dbm-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "b5781e58dfed2f10081bfe54cd0e81043225b6a051773c811a6ed656dc658646fc3c87ad65e6a780b1118604254db065612720ddec78dcf966946e26b25edfbe"

RPROVIDES:${PN} += "python39-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python39"

inherit rpm
