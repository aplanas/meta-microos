SUMMARY = "Software implementation of NAT64"
DESCRIPTION = "WrapSix is a NAT64 gateway, implemented in userspace. So far, it is \
faster than than Ecdysis (a kernelspace implementation) and Tayga \
(another userspace implementation)."
LICENSE = "GPL-3.0-only"

PV = "0.2.1"

RPM_NAME = "wrapsix-0.2.1-2.7.aarch64.rpm"
RPM_HASH = "b676b8db5e126bce339851c3a0bef1c698d2fa50ed344a33b58407af2927d50134ae345030c06a67e30e4fe4c489fc97b80226b726e35abd37112ac214c56b81"

RPROVIDES:${PN} += "config-wrapsix \
wrapsix"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
