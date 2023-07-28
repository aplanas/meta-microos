SUMMARY = "Tool to run Kubernetes locally"
DESCRIPTION = "Minikube is a tool that allows running Kubernetes locally. Minikube \
runs a single-node Kubernetes cluster inside a VM on your machine for \
users looking to try out Kubernetes or develop with it day-to-day."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "minikube-1.31.0-1.1.aarch64.rpm"
RPM_HASH = "9682014abd91f6cbb6c4ee52dba83f0dce5e70fcc42e390f0d811daccb3e61bd317bb7f7285c1782514c693424a5e11c570150ae614510617fe5efcb320cdb8b"

RPROVIDES:${PN} += "minikube"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
