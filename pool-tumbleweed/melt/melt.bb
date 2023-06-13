SUMMARY = "Multimedia framework for television broadcasting"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "melt-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "41019a0d403151e64068f64631fb24fe3b52b6c45f7957553a6e0964782bb9b70d2eb240bde06beb0f2e44624c839a4c90bac791656046bd6adb00d0e0d00f31"

RPROVIDES:${PN} += "melt \
melt(aarch-64) \
melt7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libmlt-7.so.7()(64bit) \
libmlt7-data \
libmlt7-modules"

inherit rpm
