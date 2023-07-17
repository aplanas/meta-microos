SUMMARY = "Documentation for libgphoto2"
DESCRIPTION = "gPhoto (GNU Photo) is a set of libraries for previewing, retrieving, \
and capturing images from a range of supported digital cameras to your \
local hard drive. \
 \
This is the user documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-doc-2.5.30-3.1.noarch.rpm"
RPM_HASH = "6ebc430b4aac28785033713de5a1e9c47b112e0ad76b55a0cafe3bbed8df7d545864d8476a2c04cf401a40ff6e2e8c631ae8954c48fef9cf8b6f3e76528cde8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-doc"

RDEPENDS:${PN} += ""

inherit rpm
