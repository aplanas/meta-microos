SUMMARY = "Development headers for libefivar"
DESCRIPTION = "Development headers required to use libefivar."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "efivar-devel-38-1.4.aarch64.rpm"
RPM_HASH = "8424233dd8b8cd4dac79c435e68641406c8edd9dc2d44a329d472fb74e412c7c764b779de029851bcfc3e6db59f4bdb5dfb5d5ef48718812c5f90bd93410b97c"

RPROVIDES:${PN} += "efivar-devel \
pkgconfig-efiboot \
pkgconfig-efisec \
pkgconfig-efivar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libefivar1 \
pkgconfig-efivar"

inherit rpm
