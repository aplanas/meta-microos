SUMMARY = "Development files for Unified Communication Transport (UC-T)"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libuct-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "a81b1d490a191188d88ab5ee7c5f1593c5db827497cec134eef748fcf5728327b854b2534428cca74cfdd6a66d8d939523a334fd885f25fe254de56791b19554"

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
