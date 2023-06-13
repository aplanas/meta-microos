SUMMARY = "Kubernetes kubeadm Stack"
DESCRIPTION = "This provides a vanilla kubeadm stack. It contains everything needed to \
setup kubernetes using kubeadm."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-kubernetes-kubeadm-5.1-2.1.aarch64.rpm"
RPM_HASH = "4a29a56b35ed0d1011cd6ef5b79c8969c38d16fdbb529915a8e1ab2799b3b9ab9bcdebf2c9cf62cd83c23df296e29b188d9093f811bd4fc833c68ec1d0c4e626"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-caasp-kubeadm \
patterns-containers-kubeadm \
patterns-kubernetes-kubeadm \
patterns-kubernetes-kubeadm(aarch-64)"

RDEPENDS:${PN} += "autofs \
busybox-k8s-yaml \
ceph-common \
cri-runtime \
cri-tools \
flannel-k8s-yaml \
health-checker-plugins-kubic \
hello-kubic-k8s-yaml \
helm \
kuberlr \
kubernetes-client \
kubernetes-kubeadm \
kubernetes-kubeadm-criconfig \
kubernetes-kubelet \
kured-k8s-yaml \
lvm2 \
metallb-k8s-yaml \
nfs-client \
nfs-client-provisioner-k8s-yaml \
pattern() \
rook-k8s-yaml \
rpcbind \
weave-k8s-yaml"

inherit rpm
