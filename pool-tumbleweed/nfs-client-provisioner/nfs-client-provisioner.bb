SUMMARY = "Automatic provisioner using an existing and already configured NFS server"
DESCRIPTION = "nfs-client is an automatic provisioner that uses an existing and already configured NFS server to support dynamic provisioning of Kubernetes Persistent Volumes via Persistent Volume Claims. Persistent volumes are provisioned as ${namespace}-${pvcName}-${pvName}."
LICENSE = "Apache-2.0"

PV = "4.0.0+git20210204.23ecb30"

RPM_NAME = "nfs-client-provisioner-4.0.0+git20210204.23ecb30-1.11.aarch64.rpm"
RPM_HASH = "55c932582edd7a42d2d173b9dbf2f07ec72bfc89de33b39adaf16769ff76741f4bb84ac0bfc252057a714a59105d6f9db7af40d6ebbf72bbe3a7c6eca0f76bc5"

RPROVIDES:${PN} += "nfs-client-provisioner"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
