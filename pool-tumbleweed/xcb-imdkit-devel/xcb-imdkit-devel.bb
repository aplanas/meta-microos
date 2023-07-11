SUMMARY = "Development files for xcb-imdkit"
DESCRIPTION = "This package provides development files for xcb-imdkit."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "xcb-imdkit-devel-1.0.5-1.2.aarch64.rpm"
RPM_HASH = "f63f7fdaeab78aa3e292016e22403a4fc986d17b490885879f8bb010095824f50fcb868f278c058170671633296e38e5433fff4766bd76618fd3b31508b5316f"

RPROVIDES:${PN} += "cmake-XCBImdkit \
pkgconfig-xcb-imdkit \
xcb-imdkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-imdkit1 \
pkgconfig-xcb \
pkgconfig-xcb-util"

inherit rpm
