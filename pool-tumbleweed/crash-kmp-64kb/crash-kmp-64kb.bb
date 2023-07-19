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

PV = "8.0.3_k6.4.3_1"

RPM_NAME = "crash-kmp-64kb-8.0.3_k6.4.3_1-1.11.aarch64.rpm"
RPM_HASH = "b97f48d7577549f3f6f891453b75f537fbaa1f484a0c7ff896afd647b5a5fd330b2f0ea152a5a4d5ff11da4e67ab6d6ecee18b85e06e736763ac25b0c1a2d90d"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-64kb \
crash-kmp-64kb-k6.4.3-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
