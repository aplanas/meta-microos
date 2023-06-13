SUMMARY = "Development files for LibLogging stdlog library"
DESCRIPTION = "The liblogging-devel package includes header files, libraries necessary for \
developing programs which use liblogging library."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "liblogging-devel-1.0.6-4.19.aarch64.rpm"
RPM_HASH = "54436b2e18b5874a80b219ee16f675a6fd97d9819e336c887ca9b3126fa2a09245ec89e60e77997aaa0f387adf3b8802187df693db5fa5278f5312ddd5324bb1"

RPROVIDES:${PN} += "liblogging-devel \
liblogging-devel(aarch-64) \
pkgconfig(liblogging-rfc3195) \
pkgconfig(liblogging-stdlog)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblogging0"

inherit rpm
