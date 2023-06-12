SUMMARY = "Development files for freexl"
DESCRIPTION = "This package contains all necessary include files and libraries needed to \
compile and develop applications that use libspatialite."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.0.6"

RPM_NAME = "freexl-devel-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "0365ee29c1172448f5d0e3becd1ad73c16bfc33ae27c8b03f4f15ef689c86afc2eb31ca1c822af95bb3283c30c765472893acea797a9517fc80a76086e4a81e0"

RPROVIDES:${PN} += "freexl-devel \
freexl-devel(aarch-64) \
pkgconfig(freexl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfreexl1 \
pkgconfig"

inherit rpm
