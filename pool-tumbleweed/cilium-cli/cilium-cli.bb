SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.15.7"

RPM_NAME = "cilium-cli-0.15.7-1.1.aarch64.rpm"
RPM_HASH = "ac709f55c16f1e7a3e919563f531e7fd0388c3e06d728ad19b2176785fdda7a193e884d18dbc34a845441ffa76835b7a1f41194185bc02792e82fb6625d94d64"

RPROVIDES:${PN} += "cilium-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
