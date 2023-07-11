SUMMARY = "CRI-O container runtime configuration for kubeadm"
DESCRIPTION = "This package provides the CRI-O container runtime configuration for kubeadm"
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-kubeadm-criconfig-1.24.3-1.5.aarch64.rpm"
RPM_HASH = "2805644f9d00b1e425a7d060f05ef04350fa513b9f4518cc51aaa4ee94d6b9d15b0f59777f69f90bafd50e00afd622eb85dfbc5f916f3ca95efffac2345ae29b"

RPROVIDES:${PN} += "cri-o-kubeadm-criconfig \
kubernetes-kubeadm-criconfig"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
kubernetes-kubeadm-provider"

inherit rpm
