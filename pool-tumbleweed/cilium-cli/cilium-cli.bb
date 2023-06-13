SUMMARY = "CLI to install, manage & troubleshoot Kubernetes clusters running Cilium"
DESCRIPTION = "CLI to install, manage and troubleshoot Kubernetes clusters running Cilium"
LICENSE = "Apache-2.0"

PV = "0.14.5"

RPM_NAME = "cilium-cli-0.14.5-1.1.aarch64.rpm"
RPM_HASH = "b162aa023637fe5048b0b3875565345ac5486854ff67e1292be93de31ea3f467ffd036de7882f36cd8e2f420c4b1e72dbbd41c5e998d1b4b82587743eb9b9d92"

RPROVIDES:${PN} += "cilium-cli \
cilium-cli(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
