SUMMARY = "Python3 Bindings for libaudit"
DESCRIPTION = "The audit-libs-python3 package contains the bindings for using libaudit \
by python3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.1"

RPM_NAME = "python3-audit-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "131cc077299006c1483660372838557628a054f81a3a9586019f83d478e4e133b81478d9e6e90b693d350fb3a39d74916efd20e7facb86c8d4f1518d41a13443"

RPROVIDES:${PN} += "audit-libs-python3 \
python3-audit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudit.so.1 \
libauparse.so.0 \
libc.so.6 \
python-abi"

inherit rpm
