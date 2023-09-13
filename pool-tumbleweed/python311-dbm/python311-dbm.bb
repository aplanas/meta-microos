SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-dbm-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "69ee594cd8e6e11bfa1aa88e2da5cb6ce09d75c42ed509ad83bcbd4936dc919cf3ddec7f265e63a34af3f3c132912f2cacfc80401c856f160b2c72c2afd4432e"

RPROVIDES:${PN} += "python3-dbm \
python311-dbm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm-compat.so.4 \
libgdbm.so.6 \
python-abi \
python311"

inherit rpm
