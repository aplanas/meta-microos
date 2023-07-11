SUMMARY = "Log for C++, Shibboleth Edition"
DESCRIPTION = "Log for C++ is a library of classes for flexible logging to files, syslog, \
and other destinations. It is modeled after the Log for Java library and \
stays as close to its API as is reasonable. \
 \
This package contains just the shared library."
LICENSE = "LGPL-2.1-only"

PV = "2.0.1"

RPM_NAME = "liblog4shib2-2.0.1-1.10.aarch64.rpm"
RPM_HASH = "38ab7c18e483d0b203bd8072b24ab4426fc1a2c481378d020e3de8682cae22911192e02d2e9676efef5ea11a4b09a4c8e0a477374b2d2aff16f96608a513c4f6"

RPROVIDES:${PN} += "liblog4shib.so.2 \
liblog4shib2 \
log4shib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
