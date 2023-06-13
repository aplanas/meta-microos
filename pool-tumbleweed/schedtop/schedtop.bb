SUMMARY = "Displays Scheduler Statistics"
DESCRIPTION = "This utility will process statistics from /proc/schedstat such that the \
busiest stats will bubble up to the top.  It can alternately be sorted by \
the largest stat, or by name.  Stats can be included or excluded based on \
reg-ex pattern matching."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "schedtop-1.1-30.28.aarch64.rpm"
RPM_HASH = "a82c6abd60b22ee9a7b109b69df749b203a5e685f1279faf67a5adfd8d9222a8478b2442769a824aff422dcee3d0f713fb6c4c01c22963b32647fd2f4aa8b3e8"

RPROVIDES:${PN} += "schedtop \
schedtop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncurses.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
