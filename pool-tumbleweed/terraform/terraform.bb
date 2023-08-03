SUMMARY = "Tool for building infrastructure safely and efficiently"
DESCRIPTION = "Terraform is a tool for building, changing, and versioning infrastructure \
safely and efficiently. Terraform can manage existing and popular service \
providers as well as custom in-house solutions."
LICENSE = "MPL-2.0"

PV = "1.5.4"

RPM_NAME = "terraform-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "b2c7b6787ad6a1e2adbb015bc9025ccab2f9ec54888e318d45c6e64efd4a8591d082300b5aa2727e4e771cfd5fd8c31a8ec2b2c42fd4dc2c7cedbca9fdc05afd"

RPROVIDES:${PN} += "terraform"

RDEPENDS:${PN} += ""

inherit rpm
