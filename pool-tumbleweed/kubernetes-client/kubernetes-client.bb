SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.27.3"

RPM_NAME = "kubernetes-client-1.27.3-32.1.aarch64.rpm"
RPM_HASH = "7e665a790d7507cfac6cb31f023616a600c936f9da8dbae913694c13eebc5f7768c3855d4764e4c5efc9d3df58b48e16c7aafdca07fc494418faa2357f1232fa"

RPROVIDES:${PN} += "kubernetes-client"

RDEPENDS:${PN} += "kubernetes1.27-client"

inherit rpm
