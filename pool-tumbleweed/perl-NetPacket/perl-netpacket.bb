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

RPM_NAME = "perl-NetPacket-1.7.2-1.15.noarch.rpm"
RPM_HASH = "620d0221adff22f0be9753d7fb7d348e0b6bccf8f688abd87345b50c7fec1c4effb3818b17536043edb28fb9f47702398278501915189c38801cb9b4059a1980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(NetPacket) \
perl(NetPacket::ARP) \
perl(NetPacket::Ethernet) \
perl(NetPacket::ICMP) \
perl(NetPacket::ICMPv6) \
perl(NetPacket::IGMP) \
perl(NetPacket::IP) \
perl(NetPacket::IPX) \
perl(NetPacket::IPv6) \
perl(NetPacket::TCP) \
perl(NetPacket::UDP) \
perl(NetPacket::USBMon) \
perl-NetPacket"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Socket) \
perl(parent)"

inherit rpm
