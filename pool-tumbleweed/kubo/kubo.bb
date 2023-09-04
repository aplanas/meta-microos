SUMMARY = "IPFS implementation in Go"
DESCRIPTION = "IPFS is a global, versioned, peer-to-peer filesystem. It combines good ideas from Git, BitTorrent, Kademlia, SFS, and the Web. It is like a single bittorrent swarm, exchanging git objects. IPFS provides an interface as simple as the HTTP web, but with permanence built in. You can also mount the world at /ipfs."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubo-0.22.0-1.1.aarch64.rpm"
RPM_HASH = "9c65b7bbc95e56c846a432a643f2bf7c5eee7946fe553c12529ba328fa3d47088bfc92c7a7dc7d964cf758ae5591e356e5952fad73b61e4fd67161282b6f0077"

RPROVIDES:${PN} += "go-ipfs \
ipfs \
kubo"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse \
libc.so.6 \
nss-myhostname \
systemd"

inherit rpm
