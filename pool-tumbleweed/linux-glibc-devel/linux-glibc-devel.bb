SUMMARY = "Linux headers for userspace development"
DESCRIPTION = "This package provides Linux kernel headers, the kernel API description \
required for compilation of almost all programs. This is the userspace \
interface; compiling external kernel modules requires \
kernel-(flavor)-devel, or kernel-syms to pull in all kernel-*-devel, \
packages, instead."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "linux-glibc-devel-6.4-1.1.aarch64.rpm"
RPM_HASH = "f1be6e3676fe46ff860ad79f518e5c3de1c45ef6739b18cf0524184a0e8afb23a20a46eb080a9376d0cab562639357693da02b7c9b19c9e0fe55c1bf4e3c3a32"

RPROVIDES:${PN} += "kernel-headers \
linux-glibc-devel \
linux-kernel-headers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
