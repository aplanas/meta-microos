SUMMARY = "Linux headers for x86_64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for x86_64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-x86_64-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "cdd2fc5017014c9ec2091cc7d2ed7073862cf52f0fe0c62a96c031eebc7615cfd9dba481889b965d9277c2dfdec946d28c208f9b5e7a250dd0f31b88eea67ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-x86-64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
