SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.14.8"

RPM_NAME = "cilium-cli-0.14.8-1.1.aarch64.rpm"
RPM_HASH = "b07e44a57c599188db01647d1225734ca13f8f5462a8e423a18b407599b2a3b77ba34904b4bafc2c3b07df4dfab600f145c968b8a899cceccf5c5d436a1d28a5"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
