SUMMARY = "Linux headers for s390x userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for s390x, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-s390x-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "c07a5e2e5b03cbce41445d8b55238ef845ed28cd65128c985b322a19e9e98d3e8eec9b19dcc8c0810fb7ec2f1fdec99939aa92f3c5345ac711dcbfd29d9a3906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-s390x-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
