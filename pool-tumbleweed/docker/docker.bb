SUMMARY = "The Moby-project Linux container runtime"
DESCRIPTION = "Docker complements LXC with a high-level API which operates at the process \
level. It runs unix processes with strong guarantees of isolation and \
repeatability across servers. \
 \
Docker is a great building block for automating distributed systems: large-scale \
web deployments, database clusters, continuous deployment systems, private PaaS, \
service-oriented architectures, etc."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-24.0.5_ce-2.1.aarch64.rpm"
RPM_HASH = "da9f74897c3c4595fb529200c5ad292effdc625851ecae3c016d0003a1cf0a7dab350d68662b2c3507e83935e2d6919b6b377e390e33eee6396ddf457b47fec7"

RPROVIDES:${PN} += "config-docker \
docker \
docker-libnetwork \
group-docker \
group-dockremap \
user-dockremap"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
apparmor-parser \
ca-certificates-mozilla \
catatonit \
containerd \
e2fsprogs \
fillup \
iproute2 \
iptables \
libc.so.6 \
libdevmapper.so.1.03 \
libsystemd.so.0 \
procps \
runc \
shadow \
sysuser-shadow \
tar \
udev \
xz"

inherit rpm
