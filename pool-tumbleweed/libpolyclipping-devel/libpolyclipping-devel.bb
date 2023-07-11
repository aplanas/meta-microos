SUMMARY = "Development files for libpolyclipping"
DESCRIPTION = "The polyclipping-devel package contains libraries and header files for \
developing applications that use polyclipping."
LICENSE = "BSL-1.0"

PV = "6.4.2"

RPM_NAME = "libpolyclipping-devel-6.4.2-2.9.aarch64.rpm"
RPM_HASH = "5790c70064800727b2aa3e5a09cd60a26fa2bce54fc6c6fe1ad134b75d29679ce6536e954a0f0dbaadd7e198ff2d5f3c6710e5b3116348859e6dcabca53792f1"

RPROVIDES:${PN} += "libpolyclipping-devel \
pkgconfig-polyclipping"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolyclipping22"

inherit rpm
