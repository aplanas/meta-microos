SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-dbm-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "460e692ea66ce3759d9f74f9b957f2239da8ac286b48ba84724667ed753af10ab4b37d29b879adb97937a190734945aa946838cc2eaa372cf3296c34bf5e21f1"

RPROVIDES:${PN} += "python39-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python39"

inherit rpm
