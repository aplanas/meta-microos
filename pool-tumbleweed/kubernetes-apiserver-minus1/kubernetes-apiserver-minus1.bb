SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.7"

RPM_NAME = "kubernetes-apiserver-minus1-1.26.7-34.1.aarch64.rpm"
RPM_HASH = "36e8be5b1a461e699afbba82394854959b039869f45f690f0a75acc13ae976c72becf165babcae6f75f038fb79d758ee14b073f9bb121fdc3b76992524531fbd"

RPROVIDES:${PN} += "kubernetes-apiserver-minus1"

RDEPENDS:${PN} += "kubernetes1.26-apiserver"

inherit rpm
