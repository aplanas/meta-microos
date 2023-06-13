SUMMARY = "Linux headers for aarch64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for aarch64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-aarch64-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "83f49ad089afec59360d3a27fa00df30fa04e8f3eaa67def3f32a4d934cfe39dbe49bf30b9ac9f51835e7ba42d1e99f06a96cc3b531034cd72390cc99b8324bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-aarch64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
