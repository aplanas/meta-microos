SUMMARY = "Runtime environment for systemtap"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
This package contains the runtime environment for systemtap programs."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-runtime-4.9-1.2.aarch64.rpm"
RPM_HASH = "5f5ef7d608e31d2d041b42db01ba4d9cef54c76c4feb0ed0989305590d2b609e97627cfca72e253d51e1e30039a9b5ab08b5de46948e5bcc1d4eeeb127d5ce11"

RPROVIDES:${PN} += "systemtap-runtime"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libstdc++.so.6"

inherit rpm
