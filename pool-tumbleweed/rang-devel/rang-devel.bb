SUMMARY = "A C++ library for color emission in the terminal"
DESCRIPTION = "A minimal, header only C++ library for emitting colors in the terminal."
LICENSE = "SUSE-Public-Domain"

PV = "3.2"

RPM_NAME = "rang-devel-3.2-1.2.aarch64.rpm"
RPM_HASH = "0c8c8c4af21b4d833a2ad8a4eb55c3d9851d3114a7b4733df2711c3b00abf825c92f67d6d9ef952b8bfdd0a01e75cc8def6ed98a4879ba3354a198a9a2fd6b35"

RPROVIDES:${PN} += "pkgconfig-rang \
rang-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
