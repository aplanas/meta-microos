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

PV = "0.153.1"

RPM_NAME = "helmfile-0.153.1-1.1.aarch64.rpm"
RPM_HASH = "14aa2fb2fa22990b7dfe18168b72b9088f5e782dbc07450ea569b514a2ac24966ea4993b7c2050e15532e89132a51a72894cc72bf985162a539b0bc79c86e781"

RPROVIDES:${PN} += "helmfile"

RDEPENDS:${PN} += "helm"

inherit rpm
