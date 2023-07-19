SUMMARY = "Tool for building infrastructure safely and efficiently"
DESCRIPTION = "Terraform is a tool for building, changing, and versioning infrastructure \
safely and efficiently. Terraform can manage existing and popular service \
providers as well as custom in-house solutions."
LICENSE = "MPL-2.0"

PV = "1.5.3"

RPM_NAME = "terraform-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "8e2823e86248bbe41d96f0cafca56b6179505c5d8879b7ac8bbebcefd9377e90b129ccd0682b038a8807e6bf93a700605220ba2a4fae89550add73729ff62be1"

RPROVIDES:${PN} += "terraform"

RDEPENDS:${PN} += ""

inherit rpm
