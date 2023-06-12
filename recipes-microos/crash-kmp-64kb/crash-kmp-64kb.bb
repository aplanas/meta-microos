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

RPM_NAME = "crash-kmp-64kb-8.0.3_k6.3.4_1-1.4.aarch64.rpm"
RPM_HASH = "2d59a09309a9cc24d6d09d5220126ca9307ca4fe19c6d86d77ada98c2143756eab297eadb04200635c0a8abe7a706d71457d68e71aa34e200da1078a9964b432"

RPROVIDES:${PN} += "crash-kmp crash-kmp-64kb crash-kmp-64kb(aarch-64) crash-kmp-64kb-k6.3.4_1 kmod(crash.ko) multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
