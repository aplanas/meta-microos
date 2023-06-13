SUMMARY = "Dynamically provisions volumes of CSI drivers"
DESCRIPTION = "Kubernetes external controller that monitors PersistentVolumeClaim objects created by user and creates/deletes volumes for them."
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "csi-external-provisioner-2.0.4-1.7.aarch64.rpm"
RPM_HASH = "cbfcef3fe4368d04c06646410e95502a43446fbd25edb06730070ade307a534659684e4f5f77615d045db71f8dad4461b7ec708f4d1e4ff439e5b2d116aa7afb"

RPROVIDES:${PN} += "csi-external-provisioner \
csi-external-provisioner(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
