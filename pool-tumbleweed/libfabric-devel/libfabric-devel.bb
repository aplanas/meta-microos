SUMMARY = "Development files for the libfabric library"
DESCRIPTION = "libfabric provides a user-space API to access high-performance fabric \
services, such as RDMA. This package contains the development files."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "libfabric-devel-1.18.0-2.1.aarch64.rpm"
RPM_HASH = "c596a1aa9d88d658d4393b5a626e41f0855037d748f5b30e93ef3f544c0f18c7b8dd844f48995198550e3ddd815f708436f9846e84717766eec2c15514127c46"

RPROVIDES:${PN} += "libfabric-devel \
libfabric-devel(aarch-64) \
pkgconfig(libfabric)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfabric1"

inherit rpm
