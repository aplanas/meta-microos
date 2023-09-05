SUMMARY = "Utils for V4L2 loopback devices"
DESCRIPTION = "v4l2loopback-ctl for controlling FPS, placeholder image and image format."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-utils-0.12.7-1.53.noarch.rpm"
RPM_HASH = "abb961785ce742a9bb618f3e066cb71ae57d289fc55a5f8c6ab952db42f4b323574450cfdc0e733461d92efed757d1fb3f2ed473d71b80bdf9cfc30cc8c4d2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
v4l-utils"

inherit rpm
