SUMMARY = "Development files for signond-libs"
DESCRIPTION = "This package contains the development files for signond-libs."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-libs-devel-8.61-1.1.aarch64.rpm"
RPM_HASH = "fc7c56ee7f9c1c212c8cb187101967fb689b7561fc9baf82cb370471cd7a6e532724791aa4909dfad6e5a5f0d717c6e9c5e12d2e497403559d0b3e8351c10aa4"

RPROVIDES:${PN} += "pkgconfig-SignOnExtension \
pkgconfig-signond \
signond-libs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Qt5Core \
signond \
signond-libs"

inherit rpm
