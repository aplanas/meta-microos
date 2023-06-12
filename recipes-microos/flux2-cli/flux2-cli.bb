SUMMARY = "CLI for Flux2CD"
DESCRIPTION = "Flux is a tool for keeping Kubernetes clusters in sync with sources of configuration (like Git repositories and OCI artifacts), and automating updates to configuration when there is new code to deploy. \
 \
Flux version 2 ('v2') is built from the ground up to use Kubernetes' API extension system, and to integrate with Prometheus and other core components of the Kubernetes ecosystem. In version 2, Flux supports multi-tenancy and support for syncing an arbitrary number of Git repositories, among other long-requested features. \
 \
Flux v2 is constructed with the GitOps Toolkit, a set of composable APIs and specialized tools for building Continuous Delivery on top of Kubernetes. \
 \
Flux is a Cloud Native Computing Foundation (CNCF) project, used in production by various organisations and cloud providers."
LICENSE = "Apache-2.0"

PV = "2.0.0~rc4"

RPM_NAME = "flux2-cli-2.0.0~rc4-1.1.aarch64.rpm"
RPM_HASH = "005e1ccb7d0a1e2ac9ef573381f6c97b774ab03753c1550533435e9b293fb58fd8a564f910ee4f5d51bfc0b6de2188da9409b87961f7c1cd4d793789b9c148aa"

RPROVIDES:${PN} += "flux2-cli \
flux2-cli(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
