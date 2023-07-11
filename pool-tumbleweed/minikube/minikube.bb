SUMMARY = "Tool to run Kubernetes locally"
DESCRIPTION = "Minikube is a tool that allows running Kubernetes locally. Minikube \
runs a single-node Kubernetes cluster inside a VM on your machine for \
users looking to try out Kubernetes or develop with it day-to-day."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "minikube-1.30.1-1.3.aarch64.rpm"
RPM_HASH = "1842a2c4489fe773444386c1fa201b21bee9fb91e7bc974d135c91818d1d4fb1e7aa0d46f9f1bf0078eb01ec11699cd28acd8632b25448a7d9cc713217c67bd6"

RPROVIDES:${PN} += "minikube"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
