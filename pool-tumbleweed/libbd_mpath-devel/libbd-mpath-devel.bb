SUMMARY = "Development files for the libblockdev-mpath plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_mpath plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mpath-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "0c1abf91c1fd9e340475a2eb07a734e8df9f78f19962beafa317b1c5a5cdddd1df3e1ba2808003eee90c2730eb00a83dba93ee30107b3cbcbbd468bb7c135470"

RPROVIDES:${PN} += "libbd-mpath-devel \
libblockdev-mpath-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-mpath2 \
libbd-utils-devel"

inherit rpm
