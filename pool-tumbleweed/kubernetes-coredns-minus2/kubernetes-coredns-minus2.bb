SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "kubernetes-coredns-minus2-1.9.3-34.1.aarch64.rpm"
RPM_HASH = "11ce5e21d976edde8cbf122c086e496ea274cf61c3470d1ece39dff117816094979f74eb9d7505149650d9ca0aa2c3db1fd76f462d91802e7f1ef0fe5dce99e5"

RPROVIDES:${PN} += "kubernetes-coredns-minus2"

RDEPENDS:${PN} += "coredns-for-k8s1.25"

inherit rpm
