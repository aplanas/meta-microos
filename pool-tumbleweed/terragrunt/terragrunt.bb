SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.45.18"

RPM_NAME = "terragrunt-0.45.18-1.1.aarch64.rpm"
RPM_HASH = "529c5e8cfa5978e96e40d62910e630961df83298772b852e201c3b7726f5ee087560500c6e2dca97cf02018f4ee83c4bf0ebfa5d014a635c89cd1ba9d293f3af"

RPROVIDES:${PN} += "terragrunt \
terragrunt(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
