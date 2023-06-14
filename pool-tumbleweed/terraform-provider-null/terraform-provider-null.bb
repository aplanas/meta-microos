SUMMARY = "Terraform null-provider"
DESCRIPTION = "This is a terraform provider that lets you use null files"
LICENSE = "MPL-2.0"

PV = "3.1.0"

RPM_NAME = "terraform-provider-null-3.1.0-2.9.aarch64.rpm"
RPM_HASH = "b4e5c61100476c7ab3671caad675fdb923dc255d5fd8f1211b304e19d2335d8e4fae8a0594c8f45cae3dcfe0b12b37d0e309e8f6718a01d4a2aa9d19223b2bee"

RPROVIDES:${PN} += "terraform-provider-null"

RDEPENDS:${PN} += "terraform"

inherit rpm
