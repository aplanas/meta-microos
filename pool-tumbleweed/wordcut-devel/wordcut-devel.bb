SUMMARY = "Header files for wordcut, a Thai word segmentation utility"
DESCRIPTION = "This package contains files necessary to build against libwordcut."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "wordcut-devel-0.5.1b2-205.7.aarch64.rpm"
RPM_HASH = "48670614b657d2694bb3d6f07193ea48d5562426b91b9e20a1b0a39784b6cfa1f14f6171216dc2d74276574689e2a9785ba850dc2cbe14692cdb3f886fa7962c"

RPROVIDES:${PN} += "pkgconfig-wordcut \
wordcut-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libwordcut0"

inherit rpm
