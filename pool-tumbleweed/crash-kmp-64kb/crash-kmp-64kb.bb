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

RPM_NAME = "crash-kmp-64kb-8.0.3_k6.4.2_1-1.10.aarch64.rpm"
RPM_HASH = "34735a198a3927faf885751fcdb68e31d5800b38b7b0bca2885769d6ec0f1f1833bc75004e0acf356c9a6cbb20cb422c7e0433648288513b7b3ebb0de53a2431"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-64kb \
crash-kmp-64kb-k6.4.2-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
