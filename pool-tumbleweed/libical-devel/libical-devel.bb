SUMMARY = "Development files for libical, an implementation of basic iCAL protocols"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
Calendaring and Scheduling protocols. (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-devel-3.0.16-1.5.aarch64.rpm"
RPM_HASH = "7fcf586dcc116636d9cf5a6fce72e07857a03ad9aa3c0639540b503f9c077eedc4e047bbb8936637ce4e2590c7f06ceb311d95c0f38f2bebe3df9186c0b2a7c0"

RPROVIDES:${PN} += "cmake-LibIcal \
libical-devel \
pkgconfig-libical"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libical3 \
pkgconfig-icu-i18n"

inherit rpm
