SUMMARY = "Standalone C mathematical library"
DESCRIPTION = "OpenLibm is an implementation of a standalone C mathematical library \
(libm). It can be used standalone in applications and programming \
language implementations. \
 \
The OpenLIBM code derives from the FreeBSD msun implementation, \
which in turn derives from FDLIBM 5.3. As a result, it has a number of \
fixes and updates that have accumulated over the years in msun, \
and also optimized assembly versions of many functions."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8.1"

RPM_NAME = "libopenlibm4-0.8.1-1.4.aarch64.rpm"
RPM_HASH = "95d96b918f1ff16bd96776f7b6e44b651cb43c54b3afb57acab887eb824b35d398eb5ca19c3438142aac8855f76bc97e7d8b6512c8f7fa7c604b2617ed6f72a3"

RPROVIDES:${PN} += "libopenlibm.so.4 \
libopenlibm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
