SUMMARY = "Linux headers for ppc64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for ppc64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-ppc64-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "1a7486a5234a00caa3108511db91707a12ee88264621f80e642042fb8348ac13c517c3670394d08f4ae6f26029a469f0aab7b85d4af1fbfb9f216cb28c71609d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64-linux-glibc-devel"
RDEPENDS:${PN} += ""

inherit rpm
