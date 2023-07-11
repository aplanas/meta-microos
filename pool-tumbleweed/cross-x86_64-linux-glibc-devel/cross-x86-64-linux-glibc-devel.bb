SUMMARY = "Linux headers for x86_64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for x86_64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-x86_64-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "c3353f2dd87782d77a6e415699029a3e6cdea785631cc01ec09d261de2c7427012096cc40a02f5beb66bf33439f38e919ddd571f8f41cca0a5736f9c08e7ceeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-x86-64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
