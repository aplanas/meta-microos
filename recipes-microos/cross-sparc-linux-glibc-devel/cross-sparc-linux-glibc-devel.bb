SUMMARY = "Linux headers for sparc userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for sparc, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "cross-sparc-linux-glibc-devel-6.3-1.1.noarch.rpm"
RPM_HASH = "1b6d4220dd0c55abcaaf653d13528841e7ecb28d4d810421c1d202ae451a480144287bba59183b06ddece9c3e209ddff9e837c7f86d9671dd5eabc9e8eae119e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-sparc-linux-glibc-devel"
RDEPENDS:${PN} += ""

inherit rpm
