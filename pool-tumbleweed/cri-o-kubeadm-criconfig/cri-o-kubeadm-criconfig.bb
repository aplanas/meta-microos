SUMMARY = "CRI-O container runtime configuration for kubeadm"
DESCRIPTION = "This package provides the CRI-O container runtime configuration for kubeadm"
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-kubeadm-criconfig-1.24.3-2.1.aarch64.rpm"
RPM_HASH = "7e6ec6440e15d0dade71a92f5e670025f7555a5f4893871b76b3e72d6570260dd49f3b3ffe8f127579bbdcb6b65eff8146f00a86e729ad843950c1699ac89cd2"

RPROVIDES:${PN} += "cri-o-kubeadm-criconfig \
kubernetes-kubeadm-criconfig"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
kubernetes-kubeadm-provider"

inherit rpm
