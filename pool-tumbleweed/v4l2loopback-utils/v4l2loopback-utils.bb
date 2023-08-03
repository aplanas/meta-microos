SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.49.noarch.rpm"
RPM_HASH = "e7c2fb2161b4aaa3fc3a6c06c3667fb1d20e2cdb6fbdfc1fcd18aee45fa340a44d7f2cb0a3419c0f664a702adf38e5a7d65a4505af346cd0a4d26e1959aa80ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
v4l-utils"

inherit rpm
