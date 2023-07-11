SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-dbm-3.8.17-1.1.aarch64.rpm"
RPM_HASH = "c8d38a3ee22e3f331a5763ee530de1a6acd7d4aed7dfa8543d4fa78cd4ee5b43111c94fe500f0857702976e99a4f7e9cc7ef5deb11535e7597c63229d7424854"

RPROVIDES:${PN} += "python38-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python38"

inherit rpm
