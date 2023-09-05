SUMMARY = "Development files for libwget"
DESCRIPTION = "libwget which provides an interface to many useful functions used by \
Wget2. \
 \
This subpackage contains the header files for application wanting \
to build against libwget."
LICENSE = "LGPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "wget2-devel-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "46a70fbe1a4d314f9355b3232e60dd6c28b3ad41817d00538671680d0244d25d46dcf51158e36b989d4948c7fd8b59b05d3a0c20c1063bb8804dcacbe64ad990"

RPROVIDES:${PN} += "libwget-devel \
pkgconfig-libwget \
wget2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwget2"

inherit rpm
