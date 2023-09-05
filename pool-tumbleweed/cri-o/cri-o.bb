SUMMARY = "OCI-based implementation of Kubernetes Container Runtime Interface"
DESCRIPTION = "CRI-O provides an integration path between OCI conformant runtimes \
and the kubelet. Specifically, it implements the Kubelet Container Runtime \
Interface (CRI) using OCI conformant runtimes. The scope of CRI-O is tied to \
the scope of the CRI."
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-1.24.3-2.1.aarch64.rpm"
RPM_HASH = "d44ed88b75bd7b62c3f098c19e24a18157aad00c9865e3ec2988a39d90221cfdbc6ac9cc8685c70c1ecf2a1fee0bf84d669874f19b38cb5fdee00d38b7a357f0"

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
