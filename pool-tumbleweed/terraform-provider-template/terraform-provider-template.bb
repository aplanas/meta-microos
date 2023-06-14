SUMMARY = "Terraform template-provider"
DESCRIPTION = "This is a terraform provider that lets you use template files"
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "terraform-provider-template-2.2.0-2.9.aarch64.rpm"
RPM_HASH = "7d325e6b2107e6aa435e03162c13ca35e1f20943d5babd33994a0885195fb7a5f7d79fb9d39ad67e2915d43e4153c00527e07194d2e982c4463a2d965d0d83e8"

RPROVIDES:${PN} += "terraform-provider-template"

RDEPENDS:${PN} += "terraform"

inherit rpm
