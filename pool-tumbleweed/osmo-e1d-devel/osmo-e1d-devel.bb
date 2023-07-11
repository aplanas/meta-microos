SUMMARY = "Header files for the Osmocom E1 daemon protocol library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-e1d."
LICENSE = "LGPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "osmo-e1d-devel-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "4b376419bac01ff49d9d3f96e77a9e0aa9945163401348572f03cfb8aee3ed7d45eded806361608fe72095abdcb2782f32f2ff33981c14afe66d8aea4c197571"

RPROVIDES:${PN} += "libosmo-e1d-devel \
osmo-e1d-devel \
pkgconfig-libosmo-e1d \
pkgconfig-libosmo-octoi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-e1d1 \
libosmo-octoi1 \
pkgconfig-libosmocore"

inherit rpm
