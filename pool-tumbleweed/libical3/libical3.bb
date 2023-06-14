SUMMARY = "An Implementation of Basic iCAL Protocols"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
calendaring and scheduling protocols (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical3-3.0.16-1.5.aarch64.rpm"
RPM_HASH = "d3de6e5245f3944ca7d9e98116bf05d5e0b367c40f593a970b6a352991838ef36e147c1fc16062c0a5679f0d53f119dd932592fa993d70f1d7021f19c994ad33"

RPROVIDES:${PN} += "libical \
libical-cxx.so.3 \
libical.so.3 \
libical3 \
libicalss-cxx.so.3 \
libicalss.so.3 \
libicalvcal.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
