SUMMARY = "CLI for Flux2CD"
DESCRIPTION = "Flux is a tool for keeping Kubernetes clusters in sync with sources of configuration (like Git repositories and OCI artifacts), and automating updates to configuration when there is new code to deploy. \
 \
Flux version 2 ('v2') is built from the ground up to use Kubernetes' API extension system, and to integrate with Prometheus and other core components of the Kubernetes ecosystem. In version 2, Flux supports multi-tenancy and support for syncing an arbitrary number of Git repositories, among other long-requested features. \
 \
Flux v2 is constructed with the GitOps Toolkit, a set of composable APIs and specialized tools for building Continuous Delivery on top of Kubernetes. \
 \
Flux is a Cloud Native Computing Foundation (CNCF) project, used in production by various organisations and cloud providers."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "flux2-cli-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "21683f638c5505d81f809ecaf27db7ee4fe0280b676c634fb1587a505015924bc5ce599d36c8411a32c8304f7aa81d4f43e81d85f029e5fe41f89d21368a64e3"

RPROVIDES:${PN} += "flux2-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
