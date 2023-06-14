SUMMARY = "C++ Logging Library"
DESCRIPTION = "RLOG is a C++ library to manage message logging."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "librlog5-1.4-19.4.aarch64.rpm"
RPM_HASH = "442d1d6443c6cb161e5c216c1f3cf080439245b41e14db03276ac178dffe27329f76bdfc8f963f925a01c270b997d772e90e03d0ea5617dd6349929544a9d77c"

RPROVIDES:${PN} += "librlog.so.5 \
librlog5 \
rlog"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
