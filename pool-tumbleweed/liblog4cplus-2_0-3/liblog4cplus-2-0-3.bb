SUMMARY = "C++ logging library"
DESCRIPTION = "log4cplus is a simple to use C++ logging API providing thread-safe, \
flexible, and arbitrarily granular control over log management and \
configuration. It is modeled after the Java log4j API."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "liblog4cplus-2_0-3-2.0.8-1.5.aarch64.rpm"
RPM_HASH = "e071171eef84f0b30fd3ac54f35e99fa54a674a8f0649da955d21e511b59f1d43601668bf4a0a7a2a229d691340884e5b825aca0177e63c2c4baaab60c5e7cbc"

RPROVIDES:${PN} += "liblog4cplus-2-0-3 \
liblog4cplus-2.0.so.3 \
liblog4cplusU-2.0.so.3 \
log4cplus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
