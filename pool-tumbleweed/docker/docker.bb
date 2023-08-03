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

RPM_NAME = "docker-24.0.5_ce-1.1.aarch64.rpm"
RPM_HASH = "a3c5994d7b6e06e35c47d7454ea4c40114323dc1408fbf1bc1bb9975064513aa803d30f51c245632067f507c8f7d64e962c25005c2b55ed8e01bf2937ef77ac3"

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
