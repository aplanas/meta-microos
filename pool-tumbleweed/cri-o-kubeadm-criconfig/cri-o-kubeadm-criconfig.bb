SUMMARY = "CRI-O container runtime configuration for kubeadm"
DESCRIPTION = "This package provides the CRI-O container runtime configuration for kubeadm"
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-kubeadm-criconfig-1.24.3-1.4.aarch64.rpm"
RPM_HASH = "a3cafc520b0146b6c9c22182e3f126298220f190ea8e87730c4c40889e171855b9a511ecf3f12b9feaae8502fc42588736e400a71f45d9f3447b1809a075bf82"

RPROVIDES:${PN} += "cri-o-kubeadm-criconfig \
cri-o-kubeadm-criconfig(aarch-64) \
kubernetes-kubeadm-criconfig"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
kubernetes-kubeadm-provider"

inherit rpm
