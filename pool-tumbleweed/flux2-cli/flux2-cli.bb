SUMMARY = "CLI for Flux2CD"
DESCRIPTION = "Flux is a tool for keeping Kubernetes clusters in sync with sources of configuration (like Git repositories and OCI artifacts), and automating updates to configuration when there is new code to deploy. \
 \
Flux version 2 ('v2') is built from the ground up to use Kubernetes' API extension system, and to integrate with Prometheus and other core components of the Kubernetes ecosystem. In version 2, Flux supports multi-tenancy and support for syncing an arbitrary number of Git repositories, among other long-requested features. \
 \
Flux v2 is constructed with the GitOps Toolkit, a set of composable APIs and specialized tools for building Continuous Delivery on top of Kubernetes. \
 \
Flux is a Cloud Native Computing Foundation (CNCF) project, used in production by various organisations and cloud providers."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "flux2-cli-2.0.1-1.1.aarch64.rpm"
RPM_HASH = "c8580d566d0312dde027a5a120ad99ad0842dd2bc54c9174290386f3aec348c4060d076b264168415021da5f780059f9a00de95b6b98213158a2256850e28633"

RPROVIDES:${PN} += "flux2-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
