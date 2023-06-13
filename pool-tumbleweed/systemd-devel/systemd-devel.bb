SUMMARY = "Development files for libsystemd and libudev"
DESCRIPTION = "Development headers and files for libsystemd and libudev libraries for \
developing and building applications linking to these libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-devel-253.4-2.1.aarch64.rpm"
RPM_HASH = "bf20426ee762a4dcb1b06e6091aaeaf774b0ebf69eca11da4dd92fc4003f9badbdc19115d608d651aafc7fc7dd7257a01c06617dab9f8683ffd5ebce9c1d37b2"

RPROVIDES:${PN} += "libudev-devel \
pkgconfig(libsystemd) \
pkgconfig(libudev) \
systemd-devel \
systemd-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsystemd0 \
libudev1 \
systemd-rpm-macros"

inherit rpm
