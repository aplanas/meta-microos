SUMMARY = "Crash utility for live systems; netdump, diskdump, LKCD or mcore dumpfiles"
DESCRIPTION = "The core analysis suite is a self-contained tool that can be used to \
investigate either live systems, kernel core dumps created from the \
netdump and diskdump packages from Red Hat Linux, the mcore kernel \
patch offered by Mission Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "8.0.3_k6.3.1_1"

RPM_NAME = "crash-kmp-default-8.0.3_k6.3.1_1-1.1.aarch64.rpm"
RPM_HASH = "b25a64e7e7b7fc0b7db4568e0c654430188b2977cbe4cfaecf7d3dc535cc042684b2f9a1897d14dd999ed1461bcf5ba82eda381d05f49f87e3b351390c384fc5"

RPROVIDES:${PN} += "crash-kmp crash-kmp-default crash-kmp-default(aarch-64) crash-kmp-default-k6.3.1_1 kmod(crash.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
