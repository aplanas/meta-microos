SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.15.2"

RPM_NAME = "cilium-cli-0.15.2-1.1.aarch64.rpm"
RPM_HASH = "d055f71a505646ab62915a6fd6033168e01769023c4bd64774d2656754ced7b585e12922951af2cd437377becaae8734163ce467bfa271a8653d26daf80090a5"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
