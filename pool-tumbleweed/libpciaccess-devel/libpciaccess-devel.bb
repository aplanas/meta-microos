SUMMARY = "Development files for the Generic PCI access library"
DESCRIPTION = "Provides functionality for X to access the PCI bus and devices in a \
platform-independent way. \
 \
This package contains the development headers for the library found \
in libpciaccess0."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libpciaccess-devel-0.17-1.2.aarch64.rpm"
RPM_HASH = "ec9b90d31607c7468e23c8020fb213749e7fd8827bd93b313e8955ac7117334f21a275b894d138ba1cd09b995899d89f4005f4b9734bd332fbdd09e4cda626b9"

RPROVIDES:${PN} += "libpciaccess-devel \
libpciaccess-devel(aarch-64) \
libpciaccess0-devel \
pkgconfig(pciaccess)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpciaccess0"

inherit rpm
