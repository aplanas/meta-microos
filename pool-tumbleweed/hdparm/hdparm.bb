SUMMARY = "A Program to get and set hard disk parameters"
DESCRIPTION = "A shell utility to access and tune the ioctl features of the Linux IDE \
driver and IDE drives."
LICENSE = "SUSE-Permissive"

PV = "9.65"

RPM_NAME = "hdparm-9.65-2.3.aarch64.rpm"
RPM_HASH = "5aa78ee862442e2be8a5869d528376760af49152d73b3ba7a541b2d3666b02548360ada1d5f4f16eb37c3c20488bef64a1d48fa95050e9aa822ce7fde9985a42"

RPROVIDES:${PN} += "base:/sbin/hdparm \
hdparm \
hdparm(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
