SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.48.1"

RPM_NAME = "terragrunt-0.48.1-1.1.aarch64.rpm"
RPM_HASH = "a8522479be2c3ffaeeec05e43d909fa6e9ac4e1d38010e87b3c2fa1352d70609fecb5b35303e6364d62bb6db888d360a588fa28378e84614d7c79ce6777f4035"

RPROVIDES:${PN} += "terragrunt"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
