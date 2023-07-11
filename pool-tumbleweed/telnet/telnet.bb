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

RPM_NAME = "telnet-1.2-176.4.aarch64.rpm"
RPM_HASH = "5d7f34353ee50445329853b6fab2a6f6e0150a9d597cc6870c90659a46b477cb76dac62783a2814072368d114cf99d9734bac646141256e26e4973070c13d9a4"

RPROVIDES:${PN} += "nkitb-/usr/bin/telnet \
telnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
