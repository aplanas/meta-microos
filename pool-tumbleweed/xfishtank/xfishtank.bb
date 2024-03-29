SUMMARY = "An aquarium in the root window"
DESCRIPTION = "A nice little aquarium with funny fish -- yet another background screen."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "xfishtank-2.6-1.7.aarch64.rpm"
RPM_HASH = "ae408341e679ade02ca1dcbe759970f353450cc4e9fe01bd0efb98f32539b33e98807d46c87db2cc32c39655b037fde501847fcdb76fec6f01318d588d051b6e"

RPROVIDES:${PN} += "xfishtank"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
