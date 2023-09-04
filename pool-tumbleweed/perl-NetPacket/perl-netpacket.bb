SUMMARY = "Assemble/disassemble network packets at the protocol level"
DESCRIPTION = "'NetPacket' provides a base class for a cluster of modules related to \
decoding and encoding of network protocols. Each 'NetPacket' descendent \
module knows how to encode and decode packets for the network protocol it \
implements. Consult the documentation for the module in question for \
protocol-specific implementation. \
 \
Note that there is no inheritance in the 'NetPacket::' cluster of modules \
other than each protocol module being a 'NetPacket'. This was seen to be \
too restrictive as imposing inheritance relationships (for example between \
the IP, UDP and TCP protocols) would make things like tunneling or other \
unusual situations difficult."
LICENSE = "Artistic-2.0"

PV = "1.7.2"

RPM_NAME = "perl-NetPacket-1.7.2-1.17.noarch.rpm"
RPM_HASH = "692a2e6ef0325923f0e923432e99bb151b25f8a668281a0ceef2444037a97a3b7e21e3a9323b041ed794590e7004bfb754f5ffc8406d9289168c519118b00f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-NetPacket \
perl-NetPacket--ARP \
perl-NetPacket--Ethernet \
perl-NetPacket--ICMP \
perl-NetPacket--ICMPv6 \
perl-NetPacket--IGMP \
perl-NetPacket--IP \
perl-NetPacket--IPX \
perl-NetPacket--IPv6 \
perl-NetPacket--TCP \
perl-NetPacket--UDP \
perl-NetPacket--USBMon"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Socket \
perl-parent"

inherit rpm
