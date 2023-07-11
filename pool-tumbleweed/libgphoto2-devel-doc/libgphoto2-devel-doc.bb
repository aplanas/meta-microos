SUMMARY = "Development documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is its API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-devel-doc-2.5.30-2.2.noarch.rpm"
RPM_HASH = "ca9e4aaddfce631451ae260bc59caba66e0353ced7754aabb1d249aaa6c0e1dbd2e0bd4da4f34633605b240642bd941572bad509e99cab17454baaa8351a2a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
