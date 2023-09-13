SUMMARY = "Multi pod and container log tailing for Kubernetes"
DESCRIPTION = "Stern allows you to tail multiple pods on Kubernetes and multiple containers within the pod. Each result is color coded for quicker debugging. \
 \
The query is a regular expression so the pod name can easily be filtered and you don't need to specify the exact id (for instance omitting the deployment id). If a pod is deleted it gets removed from tail and if a new pod is added it automatically gets tailed. \
 \
When a pod contains multiple containers Stern can tail all of them too without having to do this manually for each one. Simply specify the container flag to limit what containers to show. By default all containers are listened to."
LICENSE = "Apache-2.0"

PV = "1.26.0"

RPM_NAME = "stern-1.26.0-1.1.aarch64.rpm"
RPM_HASH = "2e278c9f33653c48e7b4e0de8c69c49366962f12e8b4eeeae3793abbdbc32b2e906d74e7a275fea637acd4ef766672e40392d054f58590046b6db53621ef3038"

RPROVIDES:${PN} += "stern"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
