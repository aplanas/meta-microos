SUMMARY = "Deploy Kubernetes Helm Charts"
DESCRIPTION = "Helmfile is a declarative spec for deploying helm charts. It lets you... \
 \
 * Keep a directory of chart value files and maintain changes in version control. \
 * Apply CI/CD to configuration changes. \
 * Periodically sync to avoid skew in environments. \
 \
To avoid upgrades for each iteration of helm, the helmfile executable \
delegates to helm - as a result, helm must be installed."
LICENSE = "MIT"

PV = "0.155.1"

RPM_NAME = "helmfile-0.155.1-1.1.aarch64.rpm"
RPM_HASH = "6b8b0743ece4d2ca0543267976fb1262ea16cf4aaefd4dfcfe51f6028196c51e09e67cf2abe929a7067b6e496eff5b236831a61d44d91d86f3842337ecc852f6"

RPROVIDES:${PN} += "helmfile"

RDEPENDS:${PN} += "helm"

inherit rpm
