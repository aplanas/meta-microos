SUMMARY = "Rancher kim - The Kubernetes Image Manager"
DESCRIPTION = "kim is a Kubernetes-aware CLI that will install a small builder backend consisting of a BuildKit daemon bound to the Kubelet's underlying containerd socket (for building images) along with a small server-side agent that the CLI leverages for image management (think push, pull, etc) rather than talking to the backing containerd/CRI directly. kim enables building images locally, natively on your k3s cluster."
LICENSE = "Apache-2.0"

PV = "0.1.0~beta.7"

RPM_NAME = "rancher-kim-0.1.0~beta.7-1.10.aarch64.rpm"
RPM_HASH = "c307c96b6840de4a16a9707f18d1575792354f8a8b0aaef88a38570d75a1055f271beade4f7fe1600ac1d8f25c978b1511f3d386b3886e322ff95d4183bce1c9"

RPROVIDES:${PN} += "rancher-kim"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
