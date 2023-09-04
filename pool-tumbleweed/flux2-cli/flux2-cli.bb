SUMMARY = "CLI for Flux2CD"
DESCRIPTION = "Flux is a tool for keeping Kubernetes clusters in sync with sources of configuration (like Git repositories and OCI artifacts), and automating updates to configuration when there is new code to deploy. \
 \
Flux version 2 ('v2') is built from the ground up to use Kubernetes' API extension system, and to integrate with Prometheus and other core components of the Kubernetes ecosystem. In version 2, Flux supports multi-tenancy and support for syncing an arbitrary number of Git repositories, among other long-requested features. \
 \
Flux v2 is constructed with the GitOps Toolkit, a set of composable APIs and specialized tools for building Continuous Delivery on top of Kubernetes. \
 \
Flux is a Cloud Native Computing Foundation (CNCF) project, used in production by various organisations and cloud providers."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "flux2-cli-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "427cf00e8d46f114465a2c2d40779ca5ca68b2e7d6483ecc825d1688ff0774b11ea1dbaa6320c62f017d445f2306484110a5d36a71385894ce447f8a5cbb6dc0"

RPROVIDES:${PN} += "flux2-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
