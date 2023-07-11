SUMMARY = "Terraform provider for Azure Resource Manager (AzureRM)"
DESCRIPTION = "This is a terraform provider that lets you provision servers on Azure Resource \
Manager via Terraform."
LICENSE = "MPL-2.0"

PV = "3.35.0"

RPM_NAME = "terraform-provider-azurerm-3.35.0-1.5.aarch64.rpm"
RPM_HASH = "6413594ac0d1e348918c5f5426bf6974721e35e3ccba53ecf94eef45d975ea6f27595200d1e0c722e5b6b7e310e8986fa73d4a75e339a5f1b956ebb803506ff6"

RPROVIDES:${PN} += "terraform-provider-azurerm"

RDEPENDS:${PN} += "terraform"

inherit rpm
