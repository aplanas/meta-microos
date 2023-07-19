SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.47.noarch.rpm"
RPM_HASH = "9443a84861165e1e2b002cdcc1b99049e8acb85a3869a0dc113143cfc97c03f46e475a0117290280d88c0016ccf487916574f6a3a0fbe6b4b5b4dfd197aaa31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
v4l-utils"

inherit rpm
