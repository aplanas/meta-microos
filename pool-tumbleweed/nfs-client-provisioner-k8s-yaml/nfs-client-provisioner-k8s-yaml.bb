SUMMARY = "Yaml file to deploy nfs-client-provisioner"
DESCRIPTION = "Yaml files to deploy the nfs-client-provisioner. nfs-client is an automatic provisioner that uses an existing and already configured NFS server to support dynamic provisioning of Kubernetes Persistent Volumes via Persistent Volume Claims. Persistent volumes are provisioned as ${namespace}-${pvcName}-${pvName}."
LICENSE = "Apache-2.0"

PV = "4.0.0+git20210204.23ecb30"

RPM_NAME = "nfs-client-provisioner-k8s-yaml-4.0.0+git20210204.23ecb30-1.11.aarch64.rpm"
RPM_HASH = "41ab01527663f2b32c5857c26a633896c5edcaa89a7cdbb36cecb89f0b584070be475847649d3e8605ebc5e808ecb3f8d244a83ef60535894c7887800e65e629"

RPROVIDES:${PN} += "nfs-client-provisioner-k8s-yaml \
nfs-client-provisioner-k8s-yaml(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
