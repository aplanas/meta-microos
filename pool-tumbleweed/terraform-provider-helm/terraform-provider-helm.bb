SUMMARY = "Terraform Helm provider"
DESCRIPTION = "This is a Helm provider for Terraform. \
 \
The provider manages the installed Charts in your Kubernetes cluster, in the \
same way of Helm does, through Terraform. It will also install Tiller \
automatically if it is not already present."
LICENSE = "MPL-2.0"

PV = "2.9.0"

RPM_NAME = "terraform-provider-helm-2.9.0-1.4.aarch64.rpm"
RPM_HASH = "a3fe3a8f84e1424e29c63c360f63dedc1047cdb0be5ccdbf57f81c5dbbcc5e13e1e8259c3b417168b3a3c1c6a083c097a04da018edf0994b53711b3e56ea6caa"

RPROVIDES:${PN} += "terraform-provider-helm \
terraform-provider-helm(aarch-64)"

RDEPENDS:${PN} += "terraform"

inherit rpm
