SUMMARY = "Yaml file to deploy nfs-client-provisioner"
DESCRIPTION = "Yaml files to deploy the nfs-client-provisioner. nfs-client is an automatic provisioner that uses an existing and already configured NFS server to support dynamic provisioning of Kubernetes Persistent Volumes via Persistent Volume Claims. Persistent volumes are provisioned as ${namespace}-${pvcName}-${pvName}."
LICENSE = "Apache-2.0"

PV = "4.0.0+git20210204.23ecb30"

RPM_NAME = "nfs-client-provisioner-k8s-yaml-4.0.0+git20210204.23ecb30-1.12.aarch64.rpm"
RPM_HASH = "ad551f2ee1193f457e6aaf51eab7ad69280f56712a48f8e5c8047ea55e0fd770243da590c665c33eca92b89a426b9c4bb1eede84222d3d8f7d6690c51aa480e5"

RPROVIDES:${PN} += "nfs-client-provisioner-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
