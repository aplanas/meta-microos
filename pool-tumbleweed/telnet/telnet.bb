SUMMARY = "A client program for the telnet remote login protocol"
DESCRIPTION = "Telnet is an old protocol for logging into remote systems.  It is \
rarely used, since the transfer is not encrypted (ssh is mostly used \
these days).  The telnet client is often used for debugging other \
network services. The command \
 \
telnet localhost 25 \
 \
connects to the local smtp server, for example."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "telnet-1.2-176.3.aarch64.rpm"
RPM_HASH = "f4ee46aa2a97371f3bc9c88f3588b704c307c91b0e3c9f9a0359b82d379393b4c906fc4a554a8b361ad2b3b19c8401344ad3557c4afeb48f0d654b8824c07d57"

RPROVIDES:${PN} += "nkitb:/usr/bin/telnet \
telnet \
telnet(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm