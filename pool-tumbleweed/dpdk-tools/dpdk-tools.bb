SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.8.aarch64.rpm"
RPM_HASH = "0cd064918b1c937c05aa978f322c8600d75918abf1a399066258d20e666f241dd62e9f28e6837bb547077f6c094181b2d28a7e4b9ab6fc45801709f91c9bfdc2"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
