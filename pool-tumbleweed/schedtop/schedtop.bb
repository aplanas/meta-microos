SUMMARY = "Displays Scheduler Statistics"
DESCRIPTION = "This utility will process statistics from /proc/schedstat such that the \
busiest stats will bubble up to the top.  It can alternately be sorted by \
the largest stat, or by name.  Stats can be included or excluded based on \
reg-ex pattern matching."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "schedtop-1.1-30.29.aarch64.rpm"
RPM_HASH = "6d07df7f2f72ea0e79a921fb14592933bf0cd0ebbe572e14792f45dfde05d28f511a87e7f6f15b8ee246bb3886693d0b39edf32a9a94441f1a0b8020cfdf3916"

RPROVIDES:${PN} += "schedtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
