SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.15.5"

RPM_NAME = "cilium-cli-0.15.5-1.1.aarch64.rpm"
RPM_HASH = "20a8db20291139a4496609cf2f81927377e8dcb247b35185c103b10148be929df3c1800eb98461fce8f07e6ba967739aaf90cc64e54d41cbdcb8c1631f85943f"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
