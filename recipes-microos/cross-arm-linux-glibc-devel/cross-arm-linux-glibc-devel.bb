SUMMARY = "Linux headers for arm userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for arm, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-arm-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "6e3953d1804a64826383a65e51c708e2993d821efbc67be43e5cdaa6cb1329c78e9ea67bd8262f07d6b0f0db3e51c5532287646b8667119134ba8658069c3316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-arm-linux-glibc-devel"
RDEPENDS:${PN} += ""

inherit rpm
