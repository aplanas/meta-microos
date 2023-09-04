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

PV = "8.0.3_k6.4.11_1"

RPM_NAME = "crash-kmp-64kb-8.0.3_k6.4.11_1-2.2.aarch64.rpm"
RPM_HASH = "3a95bdf3c822b352c44e7fc072f157fe4a1e65e4bdab064fb1d85838a175a786830c1f2efef61f660e2b274b28226f48c46646ea48e8fce4516933c987aabfcb"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-64kb \
crash-kmp-64kb-k6.4.11-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
