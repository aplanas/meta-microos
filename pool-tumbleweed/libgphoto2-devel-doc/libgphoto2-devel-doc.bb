SUMMARY = "Development documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is its API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.31"

RPM_NAME = "libgphoto2-devel-doc-2.5.31-1.1.noarch.rpm"
RPM_HASH = "292f7018ff38de83dfc3061d7ea8cd00bab08aee51eb0e107b6566ab86bfa52751e6237edfe3b27f7b8047707d4bc15c2c6a9265791669322bcd180430f0040d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
