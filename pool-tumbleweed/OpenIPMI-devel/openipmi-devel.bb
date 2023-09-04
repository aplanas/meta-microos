SUMMARY = "Development files for OpenIPMI"
DESCRIPTION = "These libraries are needed to get full access to the OpenIPMI \
functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-devel-2.0.31-5.14.aarch64.rpm"
RPM_HASH = "d25798d3c96e90de043aac93a3b8ca200f45f50eba14aac7a2597640f8087f9b6608681e2440693ad5f52c65fab1272c059f53030e5c6dc7e969bbf8255e8253"

RPROVIDES:${PN} += "OpenIPMI-devel \
pkgconfig-OpenIPMI \
pkgconfig-OpenIPMIcmdlang \
pkgconfig-OpenIPMIglib \
pkgconfig-OpenIPMIposix \
pkgconfig-OpenIPMIpthread \
pkgconfig-OpenIPMIui \
pkgconfig-OpenIPMIutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libOpenIPMI0 \
libOpenIPMIui1 \
pkgconfig-OpenIPMI \
pkgconfig-OpenIPMIutils \
pkgconfig-ncurses"

inherit rpm
