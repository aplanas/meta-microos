SUMMARY = "A kernel module to create V4L2 loopback devices"
DESCRIPTION = "This module allows you to create 'virtual video devices'. Normal (v4l2) \
applications will read these devices as if they were ordinary video \
devices, but the video will not be read from e.g. a capture card but \
instead it is generated by another application."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7_k6.4.6_1"

RPM_NAME = "v4l2loopback-kmp-64kb-0.12.7_k6.4.6_1-1.49.aarch64.rpm"
RPM_HASH = "323e3a1e02431bb95b9fa10c97019b35b05d8ab400d0f0d39b29300f5c8fd93e6374a6c7eb2303381768fbe1fa5a7af4c407a2802032cc055d60632367602d31"

RPROVIDES:${PN} += "kmod-v4l2loopback.ko \
multiversion-kernel \
v4l2loopback-kmp \
v4l2loopback-kmp-64kb \
v4l2loopback-kmp-64kb-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
