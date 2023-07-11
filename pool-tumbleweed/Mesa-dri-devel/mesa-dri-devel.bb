SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-dri-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "79c5a85cb74ced39268a686c6a0e0f21a5fa5223427765dd3ca32a41c9934d7010ff453f2838c949b5f38bdd4a0efc16ccbf57408b801c7873492a82f69d5b4b"

RPROVIDES:${PN} += "Mesa-dri-devel \
pkgconfig-dri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa \
pkgconfig-libdrm"

inherit rpm
