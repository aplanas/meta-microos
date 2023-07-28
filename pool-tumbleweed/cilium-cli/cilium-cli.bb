SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.15.3"

RPM_NAME = "cilium-cli-0.15.3-1.1.aarch64.rpm"
RPM_HASH = "d70e4f3d2643735d18ed3d021eecd399eca06c827c004f014e001ccb109d7c3b01cc2198278bd64ff1073b9e43c35299bf0b8529824a7663b405943f3c01b978"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
