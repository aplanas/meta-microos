SUMMARY = "Development files for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the headers for ICU."
LICENSE = "ICU"

PV = "73.2"

RPM_NAME = "libicu-devel-73.2-1.1.aarch64.rpm"
RPM_HASH = "3ce1fa2e866d26b7d3715caa964d7b477315a2602671e697f257682c4cb6017d27cebcb9fc81fe133f82b0be20188c0db036ad63495fe4541132444464397670"

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
