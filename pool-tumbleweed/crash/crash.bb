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

RPM_NAME = "crash-8.0.3-1.9.aarch64.rpm"
RPM_HASH = "7c44b4c7906b252e4b4a8663fbe116483f6896bdcb81709187a3a154fe71a230724b311ffcbebf12b93ea85a2bdb00bbc1f418f4b41e931ded500bb1d9ceecb9"

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
