SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "cilium-cli-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "8f77cf176bcd5e45ee60eef9a0bbd21c1a67686a268ab0d1b9f3f451cceb537214dde7dc85dff868443f5f8630b7c9290cc2fc2155406d342a12125c64893fd6"

RPROVIDES:${PN} += "cilium-cli cilium-cli(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
