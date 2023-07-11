SUMMARY = "CLI and validation tools for Kubelet Container Runtime Interface"
DESCRIPTION = "cri-tools provides a series of debugging and validation tools for \
Kubelet CRI, which includes: \
- crictl: CLI for kubelet CRI \
- critest: validation test suites for kubelet CRI"
LICENSE = "Apache-2.0"

PV = "1.24.1"

RPM_NAME = "cri-tools-1.24.1-1.7.aarch64.rpm"
RPM_HASH = "7d541c677ef50ad7812bc6e5895e07068e0920ec21f810dd8fc9305f5ae874fd11a4c4865574def451cb6bb39806fe52df45e9b9518a9b63012be09aca23ec15"

RPROVIDES:${PN} += "config-cri-tools \
cri-tools"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
