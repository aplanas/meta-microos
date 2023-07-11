SUMMARY = "Interface to the pcap(3) LBL packet capture library"
DESCRIPTION = "'Net::Pcap' is a Perl binding to the LBL pcap(3) library and its Win32 \
counterpart, the WinPcap library. Pcap (packet capture) is a portable API \
to capture network packet: it allows applications to capture packets at \
link-layer, bypassing the normal protocol stack. It also provides features \
like kernel-level packet filtering and access to internal statistics. \
 \
Common applications include network statistics collection, security \
monitoring, network debugging, etc."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Net-Pcap-0.21-1.4.aarch64.rpm"
RPM_HASH = "ca43b4f880db3a8a0c7abde8119c2bf3b2cc97f2e6cc1b2c09eac58900452697e5646fc766295dc081e45bd4655b47045057d7389e7831e7ff5f95965421db2c"

RPROVIDES:${PN} += "perl-Net--Pcap \
perl-Net-Pcap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
perl--MODULE-COMPAT-5.36.1 \
perl-Data--Hexdumper \
perl-NetPacket"

inherit rpm
