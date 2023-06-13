SUMMARY = "CLI and validation tools for Kubelet Container Runtime Interface"
DESCRIPTION = "cri-tools provides a series of debugging and validation tools for \
Kubelet CRI, which includes: \
- crictl: CLI for kubelet CRI \
- critest: validation test suites for kubelet CRI"
LICENSE = "Apache-2.0"

PV = "1.24.1"

RPM_NAME = "cri-tools-1.24.1-1.6.aarch64.rpm"
RPM_HASH = "e137c09f002d89e00b0a0b5728e78de36d4aa427ac0c30d8dc010a4328e94c757427a9a63f5f8ab8e6323a262475d970ffbfe49f568c8e5231b4fb5ef7e2a86a"

RPROVIDES:${PN} += "config(cri-tools) \
cri-tools \
cri-tools(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
