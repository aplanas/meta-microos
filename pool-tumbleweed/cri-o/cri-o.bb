SUMMARY = "OCI-based implementation of Kubernetes Container Runtime Interface"
DESCRIPTION = "CRI-O provides an integration path between OCI conformant runtimes \
and the kubelet. Specifically, it implements the Kubelet Container Runtime \
Interface (CRI) using OCI conformant runtimes. The scope of CRI-O is tied to \
the scope of the CRI."
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-1.24.3-1.5.aarch64.rpm"
RPM_HASH = "601d0745a39db8a30d1bc6851a17d176aeb85c23ad20fd4880bac3fe704713f281a7194716175caf808b9b2e66c5c4da260daf084efe5d361d28d381ea707afe"

RPROVIDES:${PN} += "config-cri-o \
cri-o \
cri-runtime"

RDEPENDS:${PN} += "/usr/bin/sh \
cni \
cni-plugins \
conmon \
conntrack-tools \
iproute2 \
iptables \
libc.so.6 \
libcontainers-common \
libdevmapper.so.1.03 \
libseccomp.so.2 \
patterns-base-apparmor \
runc"

inherit rpm
