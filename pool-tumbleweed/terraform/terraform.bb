SUMMARY = "Tool for building infrastructure safely and efficiently"
DESCRIPTION = "Terraform is a tool for building, changing, and versioning infrastructure \
safely and efficiently. Terraform can manage existing and popular service \
providers as well as custom in-house solutions."
LICENSE = "MPL-2.0"

PV = "1.5.2"

RPM_NAME = "terraform-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "f5535850ad2ac9a6ab2f0119008c62997459b299f97884d86b5b5b89b38bc51898a7531faf226f05a35b56b81e637222b578b9ec4d1f4a7eb875e37dc12731db"

RPROVIDES:${PN} += "terraform"

RDEPENDS:${PN} += ""

inherit rpm
