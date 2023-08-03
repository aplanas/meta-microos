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

PV = "8.0.3_k6.4.6_1"

RPM_NAME = "crash-kmp-default-8.0.3_k6.4.6_1-1.13.aarch64.rpm"
RPM_HASH = "af25db9dd1c33c8d322d7ee00dc9c001e9532672d803b47deb104f463c21c41678795f2481f7f8e46460fa7208e07fc1c73c254c561669aecd24c9947c499a45"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-default \
crash-kmp-default-k6.4.6-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
