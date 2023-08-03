SUMMARY = "Development files for Unified Communication Transport (UC-T)"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libuct-devel-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "a5aa0871cb4b6a33809fb2ddb0f69b7e5d18ddc01848dd15d77a4ce69e24fa6b3838947b9073ebcb594c0dfc2a8556cf8209dfb0d7e27df21a0b7bb202a52fbb"

RPROVIDES:${PN} += "libuct-devel \
pkgconfig-ucx-cma \
pkgconfig-ucx-ib \
pkgconfig-ucx-rdmacm \
pkgconfig-ucx-uct"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuct0 \
pkgconfig-libibverbs \
pkgconfig-librdmacm \
pkgconfig-ucx-ucs"

inherit rpm
