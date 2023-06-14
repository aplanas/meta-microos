SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-source-vanilla-6.3.4-1.1.noarch.rpm"
RPM_HASH = "39e15992f98c2e3448ad500adbb68bb2611c7fe5d4613abda75331c1bba751f399aa950dcbf1f2b8cf14f51e4b55e1051a9dc9b60d096cf4c44b3aa80584fb21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-macros"

inherit rpm
