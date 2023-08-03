SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.15.4"

RPM_NAME = "cilium-cli-0.15.4-1.1.aarch64.rpm"
RPM_HASH = "4d3798f19ff6c22302fb3e07551906070f3a5bb575ac9e24bc85bfa0c6da2f551a67bf38353751717df4b3dce0249771401fdf2180370ff2b3010bcdcd358ffc"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
