SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.52.noarch.rpm"
RPM_HASH = "3a767063f0bf31d08bc87b7183c9242d8373baac7a158ebc207472f18dd26bf4a5d43a9e28174bc2557e24536c36434b3ee4b433b436319748299382fe439dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
v4l-utils"

inherit rpm
