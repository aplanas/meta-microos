SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.45.noarch.rpm"
RPM_HASH = "332aa41ac28dc77a58265402e2fb3a5b521b14ea3ba1ddd8f651970f7a44bfeb14e7a5d2c506834ff41094237e0a22f48e132fe44f7da51da4ecc89e43afa9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
v4l-utils"

inherit rpm
