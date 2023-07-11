SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes-controller-manager-minus1-1.26.6-32.1.aarch64.rpm"
RPM_HASH = "6e06ffcaed8e09a049b37f3d3e9855816d43864fba37f53ccb6e8047cc9e514249706eba915303d6127cefaa5f0697db2bc8b0188626a97853521e710c3d1734"

RPROVIDES:${PN} += "kubernetes-controller-manager-minus1"

RDEPENDS:${PN} += "kubernetes1.26-controller-manager"

inherit rpm
