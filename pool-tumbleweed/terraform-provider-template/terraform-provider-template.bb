SUMMARY = "Terraform template-provider"
DESCRIPTION = "This is a terraform provider that lets you use template files"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "terraform-provider-template-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "e6d9dabfda431d26829b7db9ee3aacfdbb3e08b51d63b633d54e420aa5268ac4fc1405cfc23082a0ed33518663f46da65631189c8e7c8a3b06b251a8b653bbf3"

RPROVIDES:${PN} += "terraform-provider-template"

RDEPENDS:${PN} += "terraform"

inherit rpm
