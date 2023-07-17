SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.46.noarch.rpm"
RPM_HASH = "cba315962e6f5f425337be6a5ea7b3f9cf4e415ff5480bf278086997847aebb3c888fec42a593591b3b95d190c655640173816fbf44c411b30fe56c36c16b42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
v4l-utils"

inherit rpm
