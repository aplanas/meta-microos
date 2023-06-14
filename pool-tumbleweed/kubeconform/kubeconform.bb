SUMMARY = "A fast Kubernetes manifests validator, with support for custom resources"
DESCRIPTION = "Kubeconform is a Kubernetes manifests validation tool. It is inspired by, contains \
code from and is designed to stay close to Kubeval, but with the following \
improvements: \
 \
- high performance: will validate & download manifests over multiple routines, caching \
  downloaded files in memory \
- configurable list of remote, or local schemas locations, enabling validating Kubernetes \
  custom resources (CRDs) and offline validation capabilities \
- uses by default a self-updating fork of the schemas registry maintained by the \
  kubernetes-json-schema project - which guarantees up-to-date schemas for all recent versions \
  of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "kubeconform-0.6.1-1.2.aarch64.rpm"
RPM_HASH = "2cde1b7be4ebb3cf9ced6bc9ad3ed8ffc9233c74da927a690f9e504cec22586a2a533b92fd45263b2172eb8235b1f8d046395058497d5778f5e316ec3ee7400d"

RPROVIDES:${PN} += "kubeconform"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
