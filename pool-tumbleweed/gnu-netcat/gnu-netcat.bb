SUMMARY = "GNU variant of universal network utility"
DESCRIPTION = "Netcat is a networking utility which reads and writes data across \
network connections. It is a 'back-end' tool that can be used \
directly or driven by other programs and scripts. It is also a \
network debugging and exploration tool, since it can create a number \
of connection types. It provides the following main features: \
 \
  * Outbound and inbound connections, TCP or UDP, to or from any ports. \
  * Tunneling mode which allows also tunneling such as UDP to \
    TCP, with the possibility of specifying all network parameters (source \
    port/interface, listening port/interface, and the remote host allowed to \
    connect to the tunnel. \
  * Built-in port-scanning capabilities, with randomizer. \
  * Advanced usage options, such as buffered send-mode (one line every N \
    seconds), and hexdump (to stderr or to a specified file) of trasmitted and \
    received data. \
  * Optional RFC854 telnet codes parser and responder."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "gnu-netcat-0.7.1-5.17.aarch64.rpm"
RPM_HASH = "0cc7f317696f86103f0c51cb3ccf0d90cec65852078ce1f4302a0f59e670e8483196dbea38838d05bdc437dddceed7b6596dbba4647373febd76bfb74edda6b7"

RPROVIDES:${PN} += "gnu-netcat \
gnu-netcat(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
