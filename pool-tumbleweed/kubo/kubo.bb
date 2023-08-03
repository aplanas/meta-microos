SUMMARY = "IPFS implementation in Go"
DESCRIPTION = "IPFS is a global, versioned, peer-to-peer filesystem. It combines good ideas from Git, BitTorrent, Kademlia, SFS, and the Web. It is like a single bittorrent swarm, exchanging git objects. IPFS provides an interface as simple as the HTTP web, but with permanence built in. You can also mount the world at /ipfs."
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "kubo-0.21.0-1.1.aarch64.rpm"
RPM_HASH = "6b9dc4a6e80265092cf4af09c7b08686d8f5c07fa4d26a6641c245347b218fcc77dea9b62d8cb576e8b72443e49f93046f8c67acfa5722916c4f930c62d05667"

RPROVIDES:${PN} += "go-ipfs \
ipfs \
kubo"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse \
libc.so.6 \
nss-myhostname \
systemd"

inherit rpm
