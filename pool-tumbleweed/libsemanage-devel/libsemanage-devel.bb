SUMMARY = "Header files and libraries for SELinux's policy management libary"
DESCRIPTION = "The libsemanage-devel package contains the libraries and header files \
needed for developing applications that manipulate SELinux policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-devel-3.5-1.4.aarch64.rpm"
RPM_HASH = "8b961b0b35bf49aee72ec16345a74294ffde546c3d0da035ae03f36e99d22051e923bbfe4699d4cb22d8559b5344326864df71051121189aca4aef725a3de3be"

RPROVIDES:${PN} += "libsemanage-devel \
pkgconfig-libsemanage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsemanage2 \
pkgconfig-libselinux \
pkgconfig-libsepol"

inherit rpm
