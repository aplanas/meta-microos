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

RPM_NAME = "crash-8.0.3-1.4.aarch64.rpm"
RPM_HASH = "2dbbc163e77685dc07180746f124542e6b5e0a3ca02c8da9e56742b1decfeea455d9b89f6d5df964ba7f8b74cb1ae040fd75fc619ca65b5b757178b1497a5856"

RPROVIDES:${PN} += "crash \
crash(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/nm \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
