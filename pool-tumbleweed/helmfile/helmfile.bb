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

PV = "0.155.0"

RPM_NAME = "helmfile-0.155.0-1.1.aarch64.rpm"
RPM_HASH = "6a5713bbaa5868d5e565b056d2c6226d93fd09aff48d3c6c170d1c5ce0e2679cc797e3ff2b8de6d2d5cc1efb2c606753e1ab239da1e9f2225f3ca03146f9694a"

RPROVIDES:${PN} += "helmfile"

RDEPENDS:${PN} += "helm"

inherit rpm
