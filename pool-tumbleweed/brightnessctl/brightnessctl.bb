SUMMARY = "Tool to read and control device brightness"
DESCRIPTION = "A utility to read and control the display brightness."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "brightnessctl-0.5.1-1.12.aarch64.rpm"
RPM_HASH = "ea8e04bba872dc93230db87d9b6df4a9580a48a9b092c839b0273209d970f61c7aa0e007639235e3a115ae0e1e084d05a8d7802f26ab4a7848c869f483668768"

RPROVIDES:${PN} += "brightnessctl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd.so.0 \
permissions \
systemd"

inherit rpm
