SUMMARY = "Multi pod and container log tailing for Kubernetes"
DESCRIPTION = "Stern allows you to tail multiple pods on Kubernetes and multiple containers within the pod. Each result is color coded for quicker debugging. \
 \
The query is a regular expression so the pod name can easily be filtered and you don't need to specify the exact id (for instance omitting the deployment id). If a pod is deleted it gets removed from tail and if a new pod is added it automatically gets tailed. \
 \
When a pod contains multiple containers Stern can tail all of them too without having to do this manually for each one. Simply specify the container flag to limit what containers to show. By default all containers are listened to."
LICENSE = "Apache-2.0"

PV = "1.25.0"

RPM_NAME = "stern-1.25.0-1.3.aarch64.rpm"
RPM_HASH = "2543e4e61f1a7fd684eb27e60f4ec67985c720aade3b8835d5c30e0de52c10b3df330ce4480151c4bf0f885bb5cf8fe11ea34342430ba0c7a1b755085e6f3d5b"

RPROVIDES:${PN} += "stern"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
