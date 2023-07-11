SUMMARY = "Terraform Helm provider"
DESCRIPTION = "This is a Helm provider for Terraform. \
 \
The provider manages the installed Charts in your Kubernetes cluster, in the \
same way of Helm does, through Terraform. It will also install Tiller \
automatically if it is not already present."
LICENSE = "MPL-2.0"

PV = "2.9.0"

RPM_NAME = "terraform-provider-helm-2.9.0-1.5.aarch64.rpm"
RPM_HASH = "66ef3a47d259499912a80cb4b260089ff80dacd05fcabe29e57aa6cec304493da32af7bee73b3e85fd95154c500b58f667554d9c6d21cb3feb7f567896a1aeef"

RPROVIDES:${PN} += "terraform-provider-helm"

RDEPENDS:${PN} += "terraform"

inherit rpm
