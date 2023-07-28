SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.48.3"

RPM_NAME = "terragrunt-0.48.3-1.1.aarch64.rpm"
RPM_HASH = "573fd56ddf9b0ab22bfdf32db41d31b85d0ab5a67a1fdb7e086643b9466ddeca43a5a73e71b69c8839b2f69a9f8187c01b75e8d374ac7d1d856f75b17a73cece"

RPROVIDES:${PN} += "terragrunt"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
