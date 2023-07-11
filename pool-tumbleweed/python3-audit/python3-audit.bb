SUMMARY = "Python3 Bindings for libaudit"
DESCRIPTION = "The audit-libs-python3 package contains the bindings for using libaudit \
by python3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "python3-audit-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "c3d96c1b28416d26f7d709eec7619c062936afeeef95e1ea4d03b983adaee46eb9b91557caf6ae8a701d770010722e9208f598777da6a531856329924169aef7"

RPROVIDES:${PN} += "audit-libs-python3 \
python3-audit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudit.so.1 \
libauparse.so.0 \
libc.so.6 \
python-abi"

inherit rpm
