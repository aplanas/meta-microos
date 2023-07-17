SUMMARY = "Development documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is its API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-devel-doc-2.5.30-3.1.noarch.rpm"
RPM_HASH = "81268acf810612b0799e6959c7358e6cee03a1f8dd334a09cc3c05c60073eeb2a8b10a462ffcda1f2e345277833339f8c2878798e89cd27fcdfa5e1745b95453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
