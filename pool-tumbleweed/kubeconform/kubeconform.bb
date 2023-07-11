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

RPM_NAME = "kubeconform-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "d89706d97e8d3a0d49f508d56a5d665c357a0328008a88bae21e4a7b2a373b3ff7c25deadb855c667ffab50a889c78cf7b67e3681c6ead7e30a2cb55829dd0f1"

RPROVIDES:${PN} += "kubeconform"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
