SUMMARY = "Development files for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the headers for ICU."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu-devel-73.2-2.1.aarch64.rpm"
RPM_HASH = "17f3b1fd5a9435278fe4d32ac568354447f8445f413a1c866f272f94502ea36280b640ba5c8d0ff10caed62498e872d6dab8cde910eb88ccd3e39dc5b16153a4"

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
