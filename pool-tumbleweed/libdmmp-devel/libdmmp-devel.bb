SUMMARY = "Header files for multipath-tools C API"
DESCRIPTION = "This package provides development files and documentation for libdmmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "libdmmp-devel-0.9.5+68+suse.d1b6a1c-1.2.aarch64.rpm"
RPM_HASH = "32e08092ba9f551d7ab7affc0cba3bc0e1d62d998ca0f98cac0e2136a8e41c2ee8684446496bbc1774a9188140d40dbfa5a98bf1d1d3c6b12632304e9382afb3"

RPROVIDES:${PN} += "libdmmp-devel \
pkgconfig-libdmmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmmp0-2-0"

inherit rpm
