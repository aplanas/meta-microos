SUMMARY = "Terraform Helm provider"
DESCRIPTION = "This is a Helm provider for Terraform. \
 \
The provider manages the installed Charts in your Kubernetes cluster, in the \
same way of Helm does, through Terraform. It will also install Tiller \
automatically if it is not already present."
LICENSE = "MPL-2.0"

PV = "2.9.0"

RPM_NAME = "terraform-provider-helm-2.9.0-2.1.aarch64.rpm"
RPM_HASH = "d07c243ee9d71a2ceb5a2791f7c476ff6510b98681ac5fb320f7c4d1a0088e080e78ea66e616246b30f966eb38a773d958e9d1484e56dd63638db3ad5fa8881b"

RPROVIDES:${PN} += "terraform-provider-helm"

RDEPENDS:${PN} += "terraform"

inherit rpm
