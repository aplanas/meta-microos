SUMMARY = "Development libraries and headers for lzma-sdk"
DESCRIPTION = "This package contains development libraries and headers for lzma-sdk."
LICENSE = "LGPL-2.1-only"

PV = "22.01"

RPM_NAME = "lzma-sdk-devel-22.01-1.4.aarch64.rpm"
RPM_HASH = "9b0617b67d29c6091ef4d6df190f0cc969342302141f54c3d797f57d57bbb0bea0149af21bc4e2b6860a0a76163fa742c560591f13f18c1824c914348e30d163"

RPROVIDES:${PN} += "lzma-sdk-devel \
pkgconfig-clzma"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclzma-suse0"

inherit rpm
