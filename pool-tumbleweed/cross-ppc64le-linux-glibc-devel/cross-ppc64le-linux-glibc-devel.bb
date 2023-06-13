SUMMARY = "Linux headers for ppc64le userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for ppc64le, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-ppc64le-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "49978f88d407dfca3d0df3041caa2830aeb0bf5bb63d8a0515fec1fe078d2736645fdcf2822e31cc68d8bf692f5b9845b1823270030fa95728043afe085765cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64le-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
