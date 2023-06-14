SUMMARY = "Development files for libpolyclipping"
DESCRIPTION = "The polyclipping-devel package contains libraries and header files for \
developing applications that use polyclipping."
LICENSE = "BSL-1.0"

PV = "6.4.2"

RPM_NAME = "libpolyclipping-devel-6.4.2-2.8.aarch64.rpm"
RPM_HASH = "c2674799c71f55022ae9d24194fb9274e8ee6bc98706867d78bd2234cfbd5338b00947a391923fdc313ca7324f42c233fac66b07be1f89703e872c8e485c4d42"

RPROVIDES:${PN} += "libpolyclipping-devel \
pkgconfig-polyclipping"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolyclipping22"

inherit rpm
