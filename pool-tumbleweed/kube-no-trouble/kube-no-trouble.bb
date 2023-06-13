SUMMARY = "Easily check your cluster for use of deprecated APIs"
DESCRIPTION = "Easily check your cluster for use of deprecated APIs \
 \
Kubernetes 1.16 is slowly starting to roll out, not only across various managed Kubernetes offerings, and with that come a lot of API deprecations1. \
 \
Kube No Trouble (kubent) is a simple tool to check whether you're using any of these API versions in your cluster and therefore should upgrade your workloads first, before upgrading your Kubernetes cluster. \
 \
This tool will be able to detect deprecated APIs depending on how you deploy your resources, as we need the original manifest to be stored somewhere. In particular following tools are supported: \
* file - local manifests in YAML or JSON \
* kubectl - uses the kubectl.kubernetes.io/last-applied-configuration annotation \
* Helm v2 - uses Tiller manifests stored in K8s Secrets or ConfigMaps \
* Helm v3 - uses Helm manifests stored as Secrets or ConfigMaps directly in individual namespaces"
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "kube-no-trouble-0.7.0-1.4.aarch64.rpm"
RPM_HASH = "fe36834fe798c3e85dd5cfb66b7541533af20321ea397896652d686851bd46972236d291d258e50b590a23ad2fcff97d71f2195b0ba5e80f2e8af72f1b558d43"

RPROVIDES:${PN} += "kube-no-trouble \
kube-no-trouble(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
