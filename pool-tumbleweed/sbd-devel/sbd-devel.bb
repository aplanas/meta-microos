SUMMARY = "Storage-based death environment for regression tests"
DESCRIPTION = "This package provides an environment + testscripts for \
regression-testing sbd."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2+20230316.5ec38cf"

RPM_NAME = "sbd-devel-1.5.2+20230316.5ec38cf-1.1.aarch64.rpm"
RPM_HASH = "024cf18acf865976fb39ce77a5c0308e2af1b6bd98a88190aafc3e8faf73ed02dfaba4e723f4e15c4efc3184e3f18f94a2cacec853e486e21cb4ab4a0311a018"

RPROVIDES:${PN} += "libsbdtestbed.so.0 \
sbd-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
sbd"

inherit rpm
