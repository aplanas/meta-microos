SUMMARY = "Helps to Debug Serial Lines"
DESCRIPTION = "Statserial displays a table of the signals on a standard 9-pin or \
25-pin serial port and indicates the status of the handshaking lines. \
It can be useful for debugging problems with serial ports or modems."
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "statserial-1.1-742.25.aarch64.rpm"
RPM_HASH = "7206085ff14c35583fa3388faaa55990486d4c1995586cdc88d357100b2e28edcc2537553179bf46ef25155debdbe843fcf94d69a40bb17c3e8bc7edc0f584e5"

RPROVIDES:${PN} += "statserial \
statserial(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
