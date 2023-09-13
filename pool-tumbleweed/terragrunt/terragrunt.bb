SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for keeping your Terraform configurations DRY, working with multiple Terraform modules, and managing remote state."
LICENSE = "MIT"

PV = "0.50.14"

RPM_NAME = "terragrunt-0.50.14-1.1.aarch64.rpm"
RPM_HASH = "98bdc55354a144e934eff65c118a0088d5d6ae3cb3a118a731f0aa3c9b95b6f0065f6a5bc8ea1d17c4501ac7e8db48302335f19cfa87d37562999ede9f0a569b"

RPROVIDES:${PN} += "terragrunt"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
