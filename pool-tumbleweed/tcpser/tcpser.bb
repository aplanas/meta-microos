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

RPM_NAME = "tcpser-1.0rc12+git.20191116-1.13.aarch64.rpm"
RPM_HASH = "1ab8468f9212afd6278ebc9a48398a0b13cd70bc1f70a2e17a7ccaaa3258d52e9cda0f574971357ee99b94186810a615b65c42559f71538a7fbe0c08c4332664"

RPROVIDES:${PN} += "tcpser \
tcpser(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
