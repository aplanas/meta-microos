SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-dbm-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "e41693f69bed077519b9d6d318635da5e42208b8eb650c5a61dd2978ff3f9986154563b3ded879157e5c414abd6c801dd6a8da75f46aea56dacbe7bb4a45ad91"

RPROVIDES:${PN} += "python38-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python38"

inherit rpm
