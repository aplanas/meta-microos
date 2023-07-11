SUMMARY = "The Moby-project Linux container runtime"
DESCRIPTION = "Docker complements LXC with a high-level API which operates at the process \
level. It runs unix processes with strong guarantees of isolation and \
repeatability across servers. \
 \
Docker is a great building block for automating distributed systems: large-scale \
web deployments, database clusters, continuous deployment systems, private PaaS, \
service-oriented architectures, etc."
LICENSE = "Apache-2.0"

PV = "24.0.2_ce"

RPM_NAME = "docker-24.0.2_ce-2.1.aarch64.rpm"
RPM_HASH = "5c763481b4a3c53d850aa8a2c1fdc212aea19a858d894380b6cffd3ac0f402c276d103eac0568ab10b347e506020d403f54ddba5ae3290d6dc8f85f3a3313f31"

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
