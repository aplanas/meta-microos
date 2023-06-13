SUMMARY = "Development files for the OpenVAS wincmd library"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libopenvas_wincmd."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wincmd-devel-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "6c0f1ef0a3c3bf30610813fd136638633d3a5e4dbe2d8071ba2d0c95af5208caa0851d57d189df96f23f873736107324f69ab3ad768dc7fb3f45eabf9590c8d2"

RPROVIDES:${PN} += "libopenvas_wincmd-devel \
libopenvas_wincmd-devel(aarch-64) \
pkgconfig(libopenvas_wincmd)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenvas_wincmd1"

inherit rpm
