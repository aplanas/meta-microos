SUMMARY = "Development files for OpenIPMI"
DESCRIPTION = "These libraries are needed to get full access to the OpenIPMI \
functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-devel-2.0.31-5.13.aarch64.rpm"
RPM_HASH = "e922282c00f33062d351cc09992fd103afd26598f5a475157a5dab22ef3fe519214d455f3e6f61899939adcb7cecf998cb2f1f5913a843636cd24b1ff0168798"

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
