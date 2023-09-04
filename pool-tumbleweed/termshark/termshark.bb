SUMMARY = "A terminal UI for tshark"
DESCRIPTION = "Termshark is a TUI for tshark inspired by Wireshark. It can read pcap files or \
sniff live network interfaces, filter pcaps or live captures using Wireshark's \
display filters, reassemble and inspect TCP and UDP flows, view network \
conversations by protocol, and copy ranges of packets to the clipboard from the \
terminal."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "termshark-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "7784c8abb7779611026ac356ead3c153daf1df6cfdfa4a30e5b4ece2f876290137e43d89158b16108be5f8b2b6e4e331d1a091f652119caf66f132d63ad419e3"

RPROVIDES:${PN} += "termshark"

RDEPENDS:${PN} += "libc.so.6 \
wireshark"

inherit rpm
