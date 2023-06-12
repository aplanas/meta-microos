SUMMARY = "Development files for Unified Communication Transport (UC-T)"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libuct-devel-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "b3472a3d1fcccdb4d593913e3a9c8c80757fe291c8d4e5961508acd31fb9d0fdd40bf64807023d5a679faee0f940a1faa3cce8ea68c61a4ad7790f5a362d1f8a"

RPROVIDES:${PN} += "libuct-devel \
libuct-devel(aarch-64) \
pkgconfig(ucx-cma) \
pkgconfig(ucx-ib) \
pkgconfig(ucx-rdmacm) \
pkgconfig(ucx-uct)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuct0 \
pkgconfig(libibverbs) \
pkgconfig(librdmacm) \
pkgconfig(ucx-ucs)"

inherit rpm
