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

PV = "8.0.3"

RPM_NAME = "crash-8.0.3-1.13.aarch64.rpm"
RPM_HASH = "dd6fef387b0d02829ea31f0e5d6e94c161f2d10929e0faa24c2ca71ce65759b338f7a3b4d4d7aeadf3773a2507ceaec34d07f5509c39e9ab72cc0047e7d72f82"

RPROVIDES:${PN} += "crash"

RDEPENDS:${PN} += "/usr/bin/nm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblzo2.so.2 \
libm.so.6 \
libncursesw.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
libtinfo.so.6 \
libzstd.so.1"

inherit rpm
