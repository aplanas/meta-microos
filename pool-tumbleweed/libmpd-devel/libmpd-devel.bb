SUMMARY = "Development Files for libmpd"
DESCRIPTION = "This package provides the API documentation and development files needed to \
develop applications based on libmpd."
LICENSE = "GPL-2.0+"

PV = "11.8.17"

RPM_NAME = "libmpd-devel-11.8.17-1.28.aarch64.rpm"
RPM_HASH = "5b673b3835368555c7167068a126372671fbbe9d7fc7fdae5923127df987e1be01d7a8e4315247d4999b0e01f1df356c0a99b9898893bb1acf3e9189ab931406"

RPROVIDES:${PN} += "libmpd-devel \
libmpd-devel(aarch-64) \
pkgconfig(libmpd)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpd1 \
pkgconfig(glib-2.0)"

inherit rpm
