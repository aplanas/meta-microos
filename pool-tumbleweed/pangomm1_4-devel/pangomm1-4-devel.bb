SUMMARY = "C++ interface for pango -- Development Files"
DESCRIPTION = "pangomm provides a C++ interface to the pango library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.46.3"

RPM_NAME = "pangomm1_4-devel-2.46.3-2.3.aarch64.rpm"
RPM_HASH = "a6779ee3fafdee3f4a9ddfc4c3c39754dc695db9b3d7a369c71d1d41c1a97e9b53833e70e8cc1c008c4cac51125e7700cffee88015b7d1b37d8c1e659b69a4b8"

RPROVIDES:${PN} += "pangomm1_4-devel \
pangomm1_4-devel(aarch-64) \
pkgconfig(pangomm-1.4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpangomm-1_4-1 \
pkgconfig(cairomm-1.0) \
pkgconfig(glibmm-2.4) \
pkgconfig(pangocairo)"

inherit rpm
