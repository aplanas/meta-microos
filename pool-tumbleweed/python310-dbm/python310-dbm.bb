SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-dbm-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "42b46944b63cb0b1dadf13f47755e3d94d73f6f41cad5f9081cb7e434e92038f1c450d437c3dea4d59ff8e6d0794bf336406bedbc2462e0cbdb8aa2279bac53d"

RPROVIDES:${PN} += "python310-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python310"

inherit rpm
