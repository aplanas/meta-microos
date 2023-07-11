SUMMARY = "Development files for the valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code. \
 \
This package contains the libvaladoc development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.9"

RPM_NAME = "libvaladoc-0_56-devel-0.56.9-1.1.aarch64.rpm"
RPM_HASH = "403dc79553500cb62bd82463b29f9caa255ecf9258f0f5b5fa25c3c35981e71759e93d18d2478c2122476b7e25eaa64d97e9d0ebd8c2b0d6535a2aecb50729af"

RPROVIDES:${PN} += "libvaladoc-0-56-devel \
libvaladoc-devel \
pkgconfig-valadoc-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvaladoc-0-56-0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libgvc \
pkgconfig-libvala-0.56"

inherit rpm
