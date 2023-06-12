SUMMARY = "Development files for pangomm, a C++ API for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "pangomm-devel-2.50.1-1.3.aarch64.rpm"
RPM_HASH = "f4787eb86b1db95c204cf00d40f178c546fa475ece0d72e21c2651b1de6cefe0b48d976affcc6fd4781685c07ffb69f32e2da7cd590fb5affa0a14691c189951"

RPROVIDES:${PN} += "pangomm-devel \
pangomm-devel(aarch-64) \
pkgconfig(pangomm-2.48)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpangomm-2_48-1 \
pkgconfig(cairomm-1.16) \
pkgconfig(giomm-2.68) \
pkgconfig(pangocairo)"

inherit rpm
