SUMMARY = "Documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is the user documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-doc-2.5.30-2.2.noarch.rpm"
RPM_HASH = "4a84622e297779935c71e2b20a01df1aec5902552cbce7aa3dd093e0215c54577d39829068c922a4c76e42ce4c67fbe1dbfeca5703f648914a9ec631b2667a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-doc"

RDEPENDS:${PN} += ""

inherit rpm
