SUMMARY = "The Moby-project Linux container runtime"
DESCRIPTION = "Docker complements LXC with a high-level API which operates at the process \
level. It runs unix processes with strong guarantees of isolation and \
repeatability across servers. \
 \
Docker is a great building block for automating distributed systems: large-scale \
web deployments, database clusters, continuous deployment systems, private PaaS, \
service-oriented architectures, etc."
LICENSE = "Apache-2.0"

PV = "23.0.5_ce"

RPM_NAME = "docker-23.0.5_ce-1.1.aarch64.rpm"
RPM_HASH = "41a9df7f77fa3876431db47e623dedadd8da8e6a12979da5f5cda31cc225662fd0842e0d991f826f80a2ab33ca6bd6050e8053f1d909b27c3a69f26712f437df"

RPROVIDES:${PN} += "config(docker) docker docker(aarch-64) docker-libnetwork group(docker) group(dockremap) user(dockremap)"
RDEPENDS:${PN} += "(apparmor-parser or container-selinux) /bin/sh /usr/bin/mkdir /usr/bin/touch ca-certificates-mozilla catatonit containerd e2fsprogs fillup iproute2 iptables libc.so.6(GLIBC_2.34)(64bit) libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) procps runc shadow sysuser-shadow tar udev xz"

inherit rpm
