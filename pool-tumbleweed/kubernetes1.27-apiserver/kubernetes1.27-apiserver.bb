SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.27.1"

RPM_NAME = "kubernetes1.27-apiserver-1.27.1-1.2.aarch64.rpm"
RPM_HASH = "a45159d74fbdf6411bb6c306e34865c17b16cc506db8322e8bf5567c178b25f9f26bc460b9b3f10a156cdee5393bc03c4b9df14bc461f65947aadf132201e2a9"

RPROVIDES:${PN} += "kubernetes-apiserver-provider \
kubernetes1.27-apiserver \
kubernetes1.27-apiserver(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
