SUMMARY = "A kernel module to create V4L2 loopback devices"
DESCRIPTION = "This module allows you to create 'virtual video devices'. Normal (v4l2) \
applications will read these devices as if they were ordinary video \
devices, but the video will not be read from e.g. a capture card but \
instead it is generated by another application."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7_k6.3.4_1"

RPM_NAME = "v4l2loopback-kmp-default-0.12.7_k6.3.4_1-1.39.aarch64.rpm"
RPM_HASH = "2d8e5aa3056ca2ab9da0d17260332a449278af2ba8582cf0c90f8fa5d7828e0d631c35ecd7632c852242a6536a80f66ec4872a4692bab058be87059defccd94a"

RPROVIDES:${PN} += "kmod-v4l2loopback.ko \
multiversion-kernel \
v4l2loopback-kmp \
v4l2loopback-kmp-default \
v4l2loopback-kmp-default-k6.3.4-1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
