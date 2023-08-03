SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.48.5"

RPM_NAME = "terragrunt-0.48.5-1.1.aarch64.rpm"
RPM_HASH = "ed6a9ea323ff48ab949f6e008696fe68b359c4c23325eed41d2528d904785ff09ca08213fc20965c03a5dc113536a04037e4fa20d3063c6f5997c8c66d6e9d1d"

RPROVIDES:${PN} += "terragrunt"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
