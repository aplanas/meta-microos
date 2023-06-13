SUMMARY = "OCI-based implementation of Kubernetes Container Runtime Interface"
DESCRIPTION = "CRI-O provides an integration path between OCI conformant runtimes \
and the kubelet. Specifically, it implements the Kubelet Container Runtime \
Interface (CRI) using OCI conformant runtimes. The scope of CRI-O is tied to \
the scope of the CRI."
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-1.24.3-1.4.aarch64.rpm"
RPM_HASH = "64bafbc3b976353d5542b6dfb82a0f5f8828fa90bf48c6da0a06e15c1c55f1d8b83f7d8b7d1bfba78c1a0d06442fe9f699315fa7f2dbbeeb29dd95a3fa04f37e"

RPROVIDES:${PN} += "config(cri-o) \
cri-o \
cri-o(aarch-64) \
cri-runtime"

RDEPENDS:${PN} += "/bin/sh \
cni \
cni-plugins \
conmon \
conntrack-tools \
iproute2 \
iptables \
libc.so.6(GLIBC_2.34)(64bit) \
libcontainers-common \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libseccomp.so.2()(64bit) \
patterns-base-apparmor \
runc"

inherit rpm
