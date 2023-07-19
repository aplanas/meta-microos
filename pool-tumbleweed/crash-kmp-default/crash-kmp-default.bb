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

RPM_NAME = "crash-kmp-default-8.0.3_k6.4.3_1-1.11.aarch64.rpm"
RPM_HASH = "a3e17cdbccc44348633554c57523a7eb8a940b71c5ec8263b139b36229a8cda5ae32881b58217d02417a9c63e25da1a970f8a2b24ff456a08345ab194ad53565"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-default \
crash-kmp-default-k6.4.3-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
