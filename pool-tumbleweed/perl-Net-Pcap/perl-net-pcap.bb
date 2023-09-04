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

RPM_NAME = "perl-Net-Pcap-0.21-1.5.aarch64.rpm"
RPM_HASH = "1cddf2a8fdb3f9b6f1381e096ab393e559bb7b90509ef0c0fce51637f7714a957bc7cd5cb114a064b378d18b58caf00146abb31f6eac2fad516b7d45a4165ff0"

RPROVIDES:${PN} += "perl-Net--Pcap \
perl-Net-Pcap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
perl--MODULE-COMPAT-5.38.0 \
perl-Data--Hexdumper \
perl-NetPacket"

inherit rpm
