SUMMARY = "Imlib 2 - development libraries"
DESCRIPTION = "These are the development headers and library for imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-devel-1.11.1-2.1.aarch64.rpm"
RPM_HASH = "24fefc9d8925c58522f33436257ed1ec5b5697e8157f630b0de2ba5da011d92e6c0ac69728154ccc2611a5f00e57224ceb4141b9cdd86ed6950fe67f998c6ac5"

RPROVIDES:${PN} += "imlib2-devel \
pkgconfig-imlib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImlib2-1 \
xorg-x11-libX11-devel"

inherit rpm
