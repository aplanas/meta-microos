SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-dri-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "eb77d470e9aa1124c87de394ab4ccb0d80e4b8594d10a8b751dfb89c581aa9bdc78ed05e701b673d6a269f1f71f9725d11cebcc225c7d4887742bf2153e3cf85"

RPROVIDES:${PN} += "Mesa-dri-devel \
pkgconfig-dri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa \
pkgconfig-libdrm"

inherit rpm
