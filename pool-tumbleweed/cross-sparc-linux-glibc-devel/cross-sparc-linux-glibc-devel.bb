SUMMARY = "Linux headers for sparc userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for sparc, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "cross-sparc-linux-glibc-devel-6.4-1.1.noarch.rpm"
RPM_HASH = "31eebdfd7526cd1a06050143f93cb313e48152ba7d386ae369fcfe7df8ff757ed6ccc1e701afcf5efe182b88925cf0758230768638683970692b120695d799d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-sparc-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
