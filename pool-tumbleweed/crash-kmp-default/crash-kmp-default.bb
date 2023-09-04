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

RPM_NAME = "crash-kmp-default-8.0.3_k6.4.11_1-2.2.aarch64.rpm"
RPM_HASH = "5a4ed79b9170419bea20eadbc584464a7f6c9255fbc5dd06c07b2b974487c9c86098af4953b20f8a1acc0c3b7c740cb8eb947f37ef325196de21de6e80d42828"

RPROVIDES:${PN} += "crash-kmp \
crash-kmp-default \
crash-kmp-default-k6.4.11-1 \
kmod-crash.ko \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
