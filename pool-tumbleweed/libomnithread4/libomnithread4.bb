SUMMARY = "omniORB thread library"
DESCRIPTION = "Thread support library for omniORB."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libomnithread4-4.3.0-2.6.aarch64.rpm"
RPM_HASH = "f89232c067c9ad3fbb8485303e5cb048db9b6ffdc3d02df0cf9d2e7c05c728afb246def202cbb8aa8ac69f7e7be010e65611e3cfa7d52e2b2849c8659040515a"

RPROVIDES:${PN} += "libomnithread.so.4 \
libomnithread4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
