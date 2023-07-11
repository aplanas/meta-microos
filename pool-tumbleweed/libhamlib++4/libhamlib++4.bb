SUMMARY = "C++ interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "libhamlib++4-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "50916ee0743a138be53dd019847af051dca702c34d6d9e37171cbed9e199fb22d254df69f5f9a4e2d700686017fe7fceadba0d73eb4190823d1e4c3b1f6c33c0"

RPROVIDES:${PN} += "libhamlib++.so.4 \
libhamlib++4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhamlib.so.4 \
libstdc++.so.6"

inherit rpm
