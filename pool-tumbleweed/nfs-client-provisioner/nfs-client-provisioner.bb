SUMMARY = "Automatic provisioner using an existing and already configured NFS server"
DESCRIPTION = "nfs-client is an automatic provisioner that uses an existing and already configured NFS server to support dynamic provisioning of Kubernetes Persistent Volumes via Persistent Volume Claims. Persistent volumes are provisioned as ${namespace}-${pvcName}-${pvName}."
LICENSE = "Apache-2.0"

PV = "4.0.0+git20210204.23ecb30"

RPM_NAME = "nfs-client-provisioner-4.0.0+git20210204.23ecb30-1.12.aarch64.rpm"
RPM_HASH = "1cf999487c548e7f8d9c7730f447e4938a3b36da74113f24a8e5b8a664003ef52b20525c3f511c644e24d27227345e19a8f91516b11bea08a9efae0f1a86deef"

RPROVIDES:${PN} += "nfs-client-provisioner"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
