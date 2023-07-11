SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.4"

RPM_NAME = "libxml++30-devel-3.2.4-1.4.aarch64.rpm"
RPM_HASH = "3acc9bb9e425ffaff0c986f55ef58108f63e9a2b33aad224a165f8c25f634fc5c0c94fd767de689920f139f4ea778db0ea14c68ed618f33cdba7532b6602b798"

RPROVIDES:${PN} += "libxml++30-devel \
pkgconfig-libxml++-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibmm2-devel \
libxml++-3-0-1 \
pkgconfig-glibmm-2.4 \
pkgconfig-libxml-2.0"

inherit rpm
