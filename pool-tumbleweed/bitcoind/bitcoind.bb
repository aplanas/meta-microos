SUMMARY = "Headless daemon for Bitcoin crypto-currency"
DESCRIPTION = "Bitcoin is a peer-to-peer electronic cash system \
that is completely decentralized, without the need for a central server or \
trusted parties. Users hold the crypto keys to their own money and \
transact directly with each other, with the help of a P2P network to check \
for double-spending. \
 \
Full transaction history is stored locally at each client. This requires \
several GB of space, slowly growing. \
 \
This package provides bitcoind, headless bitcoin daemon."
LICENSE = "MIT"

PV = "25.0"

RPM_NAME = "bitcoind-25.0-1.1.aarch64.rpm"
RPM_HASH = "d55c8adcb14efa0870d61f477cb79404683e2c144d729bf1d5ba651fa089fb4e007762dbd42ede07eba39e727d3d7e14d094e59c6f4b031fcbf3d165c0cb41be"

RPROVIDES:${PN} += "bitcoind \
config-bitcoind"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-cxx-4.8.so \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.17 \
libstdc++.so.6 \
libzmq.so.5"

inherit rpm
