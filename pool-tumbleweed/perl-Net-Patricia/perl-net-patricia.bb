SUMMARY = "Patricia Trie perl module for fast IP address lookups"
DESCRIPTION = "This module uses a Patricia Trie data structure to quickly perform IP \
address prefix matching for applications such as IP subnet, network or \
routing table lookups. The data structure is based on a radix tree using a \
radix of two, so sometimes you see patricia implementations called 'radix' \
as well. The term 'Trie' is derived from the word 'retrieval' but is \
pronounced like 'try'. Patricia stands for 'Practical Algorithm to Retrieve \
Information Coded as Alphanumeric', and was first suggested for routing \
table lookups by Van Jacobsen. Patricia Trie performance characteristics \
are well-known as it has been employed for routing table lookups within the \
BSD kernel since the 4.3 Reno release. \
 \
The BSD radix code is thoroughly described in 'TCP/IP Illustrated, Volume \
2' by Wright and Stevens and in the paper ``A Tree-Based Packet Routing \
Table for Berkeley Unix'' by Keith Sklower."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.22"

RPM_NAME = "perl-Net-Patricia-1.22-6.3.aarch64.rpm"
RPM_HASH = "6ceb0e73e4461afa9f839ad905bb75903b334b7d178801dcb22788016ee2b583f0115fae8b005ed1095e11c3ac698499549b987c554cd4d0ae4e2c75d07f70ea"

RPROVIDES:${PN} += "perl-Net--Patricia \
perl-Net--Patricia--AF-INET \
perl-Net--Patricia--AF-INET6 \
perl-Net-Patricia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-Net--CIDR--Lite \
perl-Socket6 \
perl-Test--More \
perl-version"

inherit rpm
