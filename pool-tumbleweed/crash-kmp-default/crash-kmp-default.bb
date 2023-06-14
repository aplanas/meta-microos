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

PV = "8.0.3_k6.3.4_1"

RPM_NAME = "crash-kmp-default-8.0.3_k6.3.4_1-1.4.aarch64.rpm"
RPM_HASH = "b225c98be2919f5877da0744bc4036d1c8594a4db87f9c3e1aecf4c47e85acfef30bc1d8bc6ea9776fe23c19748429600722a7d1d147ef4fd4bad5626f125536"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-default \
crash-kmp-default-k6.3.4-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
