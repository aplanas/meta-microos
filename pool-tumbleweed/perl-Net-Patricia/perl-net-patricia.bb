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

RPM_NAME = "perl-Net-Patricia-1.22-6.5.aarch64.rpm"
RPM_HASH = "aab0816719507915713a69b6960e0df0189236a78db3e0f29729e2d27462260b2185d9f0fe8458c42b340cf761092cde77b329448c7e957053276ecaf6fa42b8"

RPROVIDES:${PN} += "perl-Net--Patricia \
perl-Net--Patricia--AF-INET \
perl-Net--Patricia--AF-INET6 \
perl-Net-Patricia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Net--CIDR--Lite \
perl-Socket6 \
perl-Test--More \
perl-version"

inherit rpm
