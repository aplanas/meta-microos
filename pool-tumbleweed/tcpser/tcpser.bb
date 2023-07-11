SUMMARY = "Serial to IP modem emulation program"
DESCRIPTION = "TCPSER turns a PC serial port into an emulated Hayes compatible modem \
that uses TCP/IP for incoming and outgoing connections. It can be \
used to allow older applications and systems designed for modem use \
to operate on the Internet. TCPSER supports all standard Hayes \
commands, and understands extended and vendor proprietary commands \
(though it does not implement many of them). \
TCPSER can be used for both inbound and outbound connections. \
 \
The original source code can be found here: \
http://www.jbrain.com/pub/linux/serial/ \
This forks changes are based upon the rc12 archive dated 11Mar09. \
The author also fixed the bug with being unable to connect to real \
telnet servers."
LICENSE = "GPL-2.0-or-later"

PV = "1.0rc12+git.20191116"

RPM_NAME = "tcpser-1.0rc12+git.20191116-1.14.aarch64.rpm"
RPM_HASH = "0500afc724aaac84c125ea46120c469fda3fc5c0962a96310c4a8cb194f618f7495f6ded3fd9d8a7b19c8bd2dd665c3e6055f0085145d02ef5c8d82527b0e3d3"

RPROVIDES:${PN} += "tcpser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
