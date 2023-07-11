SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "This package contains the controller binary for sndio."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "sndioctl-1.7.0-1.11.aarch64.rpm"
RPM_HASH = "4ebdb121471c68ecffe705d55d697dab1dc46469f04d493dddde97524322331667458eea1478383e3f1a8eb857bdf27cf57126cd5e86c7e3b12ca3d6eb3490cb"

RPROVIDES:${PN} += "sndioctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsndio.so.7.1 \
libsndio7-1"

inherit rpm
