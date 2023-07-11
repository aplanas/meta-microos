SUMMARY = "An easy to use logging library"
DESCRIPTION = "Liblogging is an easy to use logging library. \
 \
It contains the Libstdlog component is used for standard logging \
(syslog replacement) purposes via multiple channels."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "liblogging0-1.0.6-4.20.aarch64.rpm"
RPM_HASH = "859c9048545a7aae6321f2ad8c59cf4f1af834cbff6f148da73af17b05463606a29dc281f5db17c64b20d45630a336380b1ef5cceb19d9e56a67a6f4ee53aab6"

RPROVIDES:${PN} += "liblogging-rfc3195.so.0 \
liblogging-stdlog.so.0 \
liblogging0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
