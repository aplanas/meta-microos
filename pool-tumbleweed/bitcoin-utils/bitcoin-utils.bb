SUMMARY = "An end-user CLI for the Bitcoin crypto-currency"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides bitcoin-cli — a CLI tool to interact with the daemon."
LICENSE = "MIT"

PV = "25.0"

RPM_NAME = "bitcoin-utils-25.0-1.1.aarch64.rpm"
RPM_HASH = "a4f03077569bfff662d7eb18a8a11d83ce982a505422e99726909ae3276e740d38a082b5dae99f8d3f8fc15b2d9a255df109bcfa63cc7e390b4d1a553ff367c4"

RPROVIDES:${PN} += "bitcoin-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-cxx-4.8.so \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
