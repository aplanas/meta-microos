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

PV = "8.0.3_k6.4.2_1"

RPM_NAME = "crash-kmp-default-8.0.3_k6.4.2_1-1.10.aarch64.rpm"
RPM_HASH = "c6c75736665b0a1806db0416dde797539d386d961b546db441096e3b5ef549fe2928abb5f6d2550415294d3c80b09a6d301f4cb1e15c9412717ac3f9a2cccddf"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-default \
crash-kmp-default-k6.4.2-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
