SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.48.6"

RPM_NAME = "terragrunt-0.48.6-1.1.aarch64.rpm"
RPM_HASH = "9cab85852d7156a254e015c1cb9695452f47b24df0fed922623136892bb654dbf52763dffc6a62872d3c5ecb27e4d14013c9eb708e32e9b5e447a25d9b3e10b5"

RPROVIDES:${PN} += "terragrunt"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
