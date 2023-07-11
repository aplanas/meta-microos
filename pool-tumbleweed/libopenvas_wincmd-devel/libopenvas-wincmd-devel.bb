SUMMARY = "Development files for the OpenVAS wincmd library"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libopenvas_wincmd."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wincmd-devel-1.0.5-2.2.aarch64.rpm"
RPM_HASH = "5789ea4d025ba38e7c1c3da813f9e8f946068b13b3e4a292a3ef180cc66b3344aecd1de7165238210dd9800c551df87ef87b3d3c6ec7bf69f98c65390636105b"

RPROVIDES:${PN} += "libopenvas-wincmd-devel \
pkgconfig-libopenvas-wincmd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenvas-wincmd1"

inherit rpm
