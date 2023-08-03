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

RPM_NAME = "crash-kmp-64kb-8.0.3_k6.4.6_1-1.13.aarch64.rpm"
RPM_HASH = "4e856ebbfae615e404edee3747801494a3ab713999a2bb46c116a68828aaa177d8b68f64be1c20e10d05096fcb978e910ef0413b973567485c8a14af947a69a8"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-64kb \
crash-kmp-64kb-k6.4.6-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
