SUMMARY = "Log for C++, Shibboleth Edition"
DESCRIPTION = "Log for C++ is a library of classes for flexible logging to files, syslog, \
and other destinations. It is modeled after the Log for Java library and \
stays as close to its API as is reasonable. \
 \
This package contains just the shared library."
LICENSE = "LGPL-2.1-only"

PV = "2.0.1"

RPM_NAME = "liblog4shib2-2.0.1-1.9.aarch64.rpm"
RPM_HASH = "c4a7bb646a5b640566445a4bbb446c569ba183362aad760a7f4efc0cdcc7a29543980c2dff021ddfcfd08fb6ab0c27c6236ca464855a04c31525cf1023aee084"

RPROVIDES:${PN} += "liblog4shib.so.2()(64bit) \
liblog4shib2 \
liblog4shib2(aarch-64) \
log4shib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
