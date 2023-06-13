SUMMARY = "Tool for building infrastructure safely and efficiently"
DESCRIPTION = "Terraform is a tool for building, changing, and versioning infrastructure \
safely and efficiently. Terraform can manage existing and popular service \
providers as well as custom in-house solutions."
LICENSE = "MPL-2.0"

PV = "1.4.6"

RPM_NAME = "terraform-1.4.6-1.2.aarch64.rpm"
RPM_HASH = "e7b9b50a13e22e8b29de4d4e168049f30289d81adfae434d0aba34b2ef6d048bc231cfcfba86c094688aaf59a5706eb7462ea93c99acade648806e04b01263f0"

RPROVIDES:${PN} += "terraform \
terraform(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
