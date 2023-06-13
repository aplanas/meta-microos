SUMMARY = "K8s yaml file to deploy busybox"
DESCRIPTION = "K8s yaml file to deploy busybox on a kubernetes cluster."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "busybox-k8s-yaml-1.0-2.8.noarch.rpm"
RPM_HASH = "4dd5fa8be8ffe75ea8813487851b2e08af825fc49718cf17cb124d8d7b2b6d48d0d18dbc2231da6b9f2f4b4530e1ce291f7b729656ca38ce68ac547d02cc9b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
