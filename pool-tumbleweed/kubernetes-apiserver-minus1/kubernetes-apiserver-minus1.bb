SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.26.6"

RPM_NAME = "kubernetes-apiserver-minus1-1.26.6-32.1.aarch64.rpm"
RPM_HASH = "9cad0ce77ea148e18a877b4a8dc1ea93829573e4a3bcc117d3180a7c065323961b31138c9daf279a0c3fc1e1bbcdf651407b525fa218cceaa6f9263697749cf5"

RPROVIDES:${PN} += "kubernetes-apiserver-minus1"

RDEPENDS:${PN} += "kubernetes1.26-apiserver"

inherit rpm
