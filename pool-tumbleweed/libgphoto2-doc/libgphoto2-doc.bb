SUMMARY = "Documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is the user documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.31"

RPM_NAME = "libgphoto2-doc-2.5.31-1.1.noarch.rpm"
RPM_HASH = "5c8ad07de68fe0380164a2f6e593b0b4cfdd3efbaeded5a635d5d0534283efb3a3c085d0c6e7325cd2175353a0f221ebfd95b1a4f581ece298efe64d76c9bd14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-doc"

RDEPENDS:${PN} += ""

inherit rpm
