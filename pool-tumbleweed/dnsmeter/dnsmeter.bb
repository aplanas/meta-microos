SUMMARY = "DNS performance and infrastructure testing"
DESCRIPTION = "DNSMeter is a tool for testing performance of nameserver and/or \
infrastructure around it. \
It generates dns queries and sends them via UDP to a target nameserver \
and counts the answers. \
 \
Features: \
 - payload can be given as text file or pcap file \
 - can automatically run different load steps, which can be given as \
   list or ranges \
 - results per load step can be stored in CSV file \
 - sender address can be spoofed from a given network or from pcap file, \
   if payload is a pcap file \
 - answers are counted, even if source address is spoofed, if answers get \
   routed back to the load generator \
 - roundtrip-times are measured (average, min, mix) \
 - amount of DNSSEC queries can be given as percentage of total traffic \
 - optimized for high amount of packets. On an Intel(R) Xeon(R) CPU E5-2430 \
   v2 @ 2.50GHz it can generate more than 900.000 packets per second"
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "dnsmeter-1.0.2-1.9.aarch64.rpm"
RPM_HASH = "0bf1ff59f8c3e35f20387fbf5319b6cd802727e293cc98d9ace99341119ff9fd9196bd5cc364ed116e1c1a1e1fe8d6f43d60f4a72811dd87bb208b077620ebe4"

RPROVIDES:${PN} += "dnsmeter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
