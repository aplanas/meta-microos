SUMMARY = "Development files for libcnotify, a C notify library"
DESCRIPTION = "A library for C notify functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcnotify."
LICENSE = "LGPL-3.0-or-later"

PV = "20220108"

RPM_NAME = "libcnotify-devel-20220108-3.3.aarch64.rpm"
RPM_HASH = "8d3fafb96e5100fad75233747e9e3e1ef1a4ce65dcfd5ea422a23f18fba0fc87c51b490e7bd524c79807a5a5997a91aab9cdeabc1ba26f7dcf236195a2d7cfee"

RPROVIDES:${PN} += "libcnotify-devel \
pkgconfig-libcnotify"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcnotify1"

inherit rpm
