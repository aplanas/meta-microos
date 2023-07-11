SUMMARY = "Development files for libdatovka"
DESCRIPTION = "The libdatovka-devel package contains libraries and header files for \
developing applications that use libdatovka."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "libdatovka-devel-0.3.0-1.4.aarch64.rpm"
RPM_HASH = "8f443143f4417c0d5715a8957bfd867d7d0fb7410e4fc604dfc7b70ba9cbdbeeb2622989f13f506bef3138eec1c14f6d29c79b026158d303efdb0d88b24189da"

RPROVIDES:${PN} += "libdatovka-devel \
pkgconfig-libdatovka"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdatovka4 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0"

inherit rpm
