SUMMARY = "The Moby-project Linux container runtime"
DESCRIPTION = "Docker complements LXC with a high-level API which operates at the process \
level. It runs unix processes with strong guarantees of isolation and \
repeatability across servers. \
 \
Docker is a great building block for automating distributed systems: large-scale \
web deployments, database clusters, continuous deployment systems, private PaaS, \
service-oriented architectures, etc."
LICENSE = "Apache-2.0"

PV = "23.0.6_ce"

RPM_NAME = "docker-23.0.6_ce-1.1.aarch64.rpm"
RPM_HASH = "9b2a875fcb0fd91916d5423e63943ccdfdfc49593374be33884202255e4dd236d53437b547023057cc2fbd50ee6c7a15d6e62e3da550a334519d2d4c5412ef1b"

RPROVIDES:${PN} += "config(docker) \
docker \
docker(aarch-64) \
docker-libnetwork \
group(docker) \
group(dockremap) \
user(dockremap)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
apparmor-parser \
ca-certificates-mozilla \
catatonit \
containerd \
e2fsprogs \
fillup \
iproute2 \
iptables \
libc.so.6(GLIBC_2.34)(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
procps \
runc \
shadow \
sysuser-shadow \
tar \
udev \
xz"

inherit rpm