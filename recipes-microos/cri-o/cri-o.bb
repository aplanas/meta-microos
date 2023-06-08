SUMMARY = "OCI-based implementation of Kubernetes Container Runtime Interface"
DESCRIPTION = "CRI-O provides an integration path between OCI conformant runtimes \
and the kubelet. Specifically, it implements the Kubelet Container Runtime \
Interface (CRI) using OCI conformant runtimes. The scope of CRI-O is tied to \
the scope of the CRI."
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-1.24.3-1.3.aarch64.rpm"
RPM_HASH = "a79b264e04489982aad47253c177b0d0278ae390e1500131c7d1e94fd9974fd0cf5c5fc2c48fd4e6d437fb0ac83d5bfaa48486a3703ce0485099e3132e79ed88"

RPROVIDES:${PN} += "config(cri-o) cri-o cri-o(aarch-64) cri-runtime"
RDEPENDS:${PN} += "/bin/sh cni cni-plugins conmon conntrack-tools iproute2 iptables libc.so.6(GLIBC_2.34)(64bit) libcontainers-common libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libseccomp.so.2()(64bit) patterns-base-apparmor runc"

inherit rpm
