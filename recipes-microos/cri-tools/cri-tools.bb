SUMMARY = "CLI and validation tools for Kubelet Container Runtime Interface"
DESCRIPTION = "cri-tools provides a series of debugging and validation tools for \
Kubelet CRI, which includes: \
- crictl: CLI for kubelet CRI \
- critest: validation test suites for kubelet CRI"
LICENSE = "Apache-2.0"

PV = "1.24.1"

RPM_NAME = "cri-tools-1.24.1-1.5.aarch64.rpm"
RPM_HASH = "37ca15f7cde500a9fd96aa2aefc49326d3b1c691479af3793db03a0947bc372bc866aa8180f37da4e3142c167d71b92851fe1a158eaa10e29427445b0c5eb3e7"

RPROVIDES:${PN} += "config(cri-tools) cri-tools cri-tools(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
