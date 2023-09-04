SUMMARY = "Tool for building infrastructure safely and efficiently"
DESCRIPTION = "Terraform is a tool for building, changing, and versioning infrastructure \
safely and efficiently. Terraform can manage existing and popular service \
providers as well as custom in-house solutions."
LICENSE = "MPL-2.0"

PV = "1.5.5"

RPM_NAME = "terraform-1.5.5-1.1.aarch64.rpm"
RPM_HASH = "0c53e29d63bb4265892f33f47880ff46ef7c4e62f4ff70be1611dae16a92b7b7862eac822151302536a3010db97448ab8e96bba130f139eb36ffb97eee6f081d"

RPROVIDES:${PN} += "terraform"

RDEPENDS:${PN} += ""

inherit rpm
