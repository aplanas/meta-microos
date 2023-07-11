SUMMARY = "Multimedia framework for television broadcasting"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "melt-7.16.0-1.2.aarch64.rpm"
RPM_HASH = "ac719f1b513a4faeff1bc7d825bd5b0d593d6a57fe2b2d289e959edebb5e5e41dd66a660aeffbd3c3d5fc40b5308fe3e8ddcc002824d1e73bdf402879398929a"

RPROVIDES:${PN} += "melt \
melt7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libmlt-7.so.7 \
libmlt7-data \
libmlt7-modules"

inherit rpm
