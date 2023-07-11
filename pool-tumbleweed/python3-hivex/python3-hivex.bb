SUMMARY = "Python bindings for libhivex"
DESCRIPTION = "This subpackage contains the Python bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "python3-hivex-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "35db079fac32bca54b8a27033561d320d941c619acc4ce5dda39a3aac5151423d978b10ffb2f8ed33ffd00c77ce8b4f61c3511d2aa1374908f053f1ad552a58a"

RPROVIDES:${PN} += "libhivexmod.so \
python-hivex \
python3-hivex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
python-abi"

inherit rpm
