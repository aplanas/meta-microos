SUMMARY = "A kernel module to create V4L2 loopback devices"
DESCRIPTION = "This module allows you to create 'virtual video devices'. Normal (v4l2) \
applications will read these devices as if they were ordinary video \
devices, but the video will not be read from e.g. a capture card but \
instead it is generated by another application."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7_k6.4.12_1"

RPM_NAME = "v4l2loopback-kmp-default-0.12.7_k6.4.12_1-1.53.aarch64.rpm"
RPM_HASH = "ab10e2a09e0f8778608724d048253ca06abae3e6d66db46a00174f9c19223b4fea969035d8b13e25fd8041475851b071c4c35818beaa64c71fdd58c148809553"

RPROVIDES:${PN} += "kmod-v4l2loopback.ko \
multiversion-kernel \
v4l2loopback-kmp \
v4l2loopback-kmp-default \
v4l2loopback-kmp-default-k6.4.12-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
