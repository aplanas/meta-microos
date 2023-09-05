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

RPM_NAME = "crash-8.0.3-2.3.aarch64.rpm"
RPM_HASH = "b1bdff436b4e718386769e662b3adfeb47be4e2b3cc414ae583177c05c584d55e6c18f8a10ee64867206d7ccb552b2922d37517a91422a5bb7550305ba924f0c"

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
