SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.24.15"

RPM_NAME = "kubernetes1.24-controller-manager-1.24.15-2.1.aarch64.rpm"
RPM_HASH = "2d9e4f38ee8c6855996aa08cf855a1a8d60adbf40ff33d55e823d37f151a84844f4fbfbe865be30c568b45a6859098c66177ecd7ea266ab2b172a6b3e397a823"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.24-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm
