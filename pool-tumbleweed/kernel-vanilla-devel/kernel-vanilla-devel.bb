SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-vanilla-devel-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "ee46a8fa5746b7f563040d835321f052efaaacf50850404dc22739c6cee157c7e3cea40a3e2b296d4c8d761c3a6254ae743afff8241e491b23dc15bdb713a9e7"

RPROVIDES:${PN} += "kernel-vanilla-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
kernel-source-vanilla \
libc.so.6 \
libcrypto.so.3 \
libelf.so.1"

inherit rpm
