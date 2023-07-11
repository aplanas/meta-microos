SUMMARY = "A Kubernetes cluster resource sanitizer"
DESCRIPTION = "Pluto is a utility to help users find deprecated Kubernetes apiVersions in their code repositories and their helm releases. \
peye is a utility that scans live Kubernetes cluster and reports potential issues with deployed resources and configurations. It sanitizes your cluster based on what's deployed and not what's sitting on disk. By scanning your cluster, it detects misconfigurations and helps you to ensure that best practices are in place, thus preventing future headaches. It aims at reducing the cognitive overload one faces when operating a Kubernetes cluster in the wild. Furthermore, if your cluster employs a metric-server, it reports potential resources over/under allocations and attempts to warn you should your cluster run out of capacity. \
Popeye is a readonly tool, it does not alter any of your Kubernetes resources in any way!"
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "popeye-0.11.1-1.5.aarch64.rpm"
RPM_HASH = "89374c1c1c1ff1a8c93ee42c7d538e39e8e4870d31169dfd20644a7d2b63b35e85c21367f5fa9cc866fdc86a4b476d56f0b318ce049529cdd65debd5114eaa78"

RPROVIDES:${PN} += "popeye"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
