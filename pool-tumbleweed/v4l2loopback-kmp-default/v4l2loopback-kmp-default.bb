SUMMARY = "A kernel module to create V4L2 loopback devices"
DESCRIPTION = "This module allows you to create 'virtual video devices'. Normal (v4l2) \
applications will read these devices as if they were ordinary video \
devices, but the video will not be read from e.g. a capture card but \
instead it is generated by another application."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7_k6.4.2_1"

RPM_NAME = "v4l2loopback-kmp-default-0.12.7_k6.4.2_1-1.46.aarch64.rpm"
RPM_HASH = "2e354df51e5f7a48742fa951014c7bc7158fade8321070d61eb0bf6b305ef0857ce3dfa80591085ae22e97e79ac87b7d2a6b924b8e35043028ecd77020e11d9a"

RPROVIDES:${PN} += "kmod-v4l2loopback.ko \
multiversion-kernel \
v4l2loopback-kmp \
v4l2loopback-kmp-default \
v4l2loopback-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
