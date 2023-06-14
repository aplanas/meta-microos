SUMMARY = "Terraform vSphere provider"
DESCRIPTION = "This is a terraform provider that lets you provision servers on a VMWare vSphere server."
LICENSE = "MPL-2.0"

PV = "2.0.2"

RPM_NAME = "terraform-provider-vsphere-2.0.2-2.8.aarch64.rpm"
RPM_HASH = "b06061be2aa13aa54d30bdfe407a0b692e70bc2b294fe42dec14549cec51e09884ba718d0c0bd31711cb0bbd397ca3638da68d0b3043880c10e22d701e5fa5c7"

RPROVIDES:${PN} += "terraform-provider-vsphere"

RDEPENDS:${PN} += "mkisofs \
terraform"

inherit rpm
