SUMMARY = "Development files for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the headers for ICU."
LICENSE = "ICU"

PV = "73.1"

RPM_NAME = "libicu-devel-73.1-1.1.aarch64.rpm"
RPM_HASH = "a61a988ca39f304392b91482c78a84c854300a436a39b99fd01cfed4932b0ce78d0f3e69e64512fe7947028ce7894431d2eab244abfb0c6ae537af8f7890d44a"

RPROVIDES:${PN} += "libicu-devel \
pkgconfig-icu-i18n \
pkgconfig-icu-io \
pkgconfig-icu-uc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libicu73 \
pkgconfig-icu-i18n \
pkgconfig-icu-uc"

inherit rpm
