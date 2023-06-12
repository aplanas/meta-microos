SUMMARY = "Container Runtime for kubernetes clustered systems"
DESCRIPTION = "This pattern installs the default container runtime packages for kubernetes clustered systems."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-kubernetes-container_runtime_kubernetes-5.1-2.1.aarch64.rpm"
RPM_HASH = "499402123602b7ff1847fa6f6af9d11271cd71a7c46610a3adaefdebac85abb360f144eda1e8be0b368d6c2973e7312efc09cafc09460f61432613f2cafe513b"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-caasp-container-runtime-kubernetes \
patterns-containers-container-runtime-kubernetes \
patterns-kubernetes-container_runtime_kubernetes \
patterns-kubernetes-container_runtime_kubernetes(aarch-64)"
RDEPENDS:${PN} += "cri-o \
cri-o-kubeadm-criconfig \
pattern()"

inherit rpm
