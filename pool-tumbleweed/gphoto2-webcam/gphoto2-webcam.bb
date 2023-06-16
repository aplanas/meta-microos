SUMMARY = "A wrapper script for running a webcam based on gphoto2"
DESCRIPTION = "This package contains a gphoto2-webcam script that feeds gphoto2 previews \
into a virtual video4linux2 loopback device. \
 \
You need to run as root: \
 \
	modprobe v4l2loopback exclusive_caps=1 card_label='GPhoto2 Webcam'"
LICENSE = "GPL-2.0-or-later"

PV = "1"

RPM_NAME = "gphoto2-webcam-1-1.18.aarch64.rpm"
RPM_HASH = "c348b079963401ff288a5c953aad5cc338460f215e29f69919ef87b9340089452ce86dfc0ef8685370c9ed7ba843541d1c574f70fed4939f09484cd302972108"

RPROVIDES:${PN} += "gphoto2-webcam"

RDEPENDS:${PN} += "/usr/bin/bash \
ffmpeg \
gphoto \
kmod-v4l2loopback.ko \
v4l-utils"

inherit rpm
