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

RPM_NAME = "crash-kmp-64kb-8.0.3_k6.3.1_1-1.1.aarch64.rpm"
RPM_HASH = "cd292a1cdab9a84abcaff7f87fbf7fab062bfd01ae9d9d1e9a8cfe6cc8c3c37a1c83d47eb6e8a69330e76d9c09fd2615cbf09e2530022e91e7ea6fef0333813a"

RPROVIDES:${PN} += "crash-kmp crash-kmp-64kb crash-kmp-64kb(aarch-64) crash-kmp-64kb-k6.3.1_1 kmod(crash.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
