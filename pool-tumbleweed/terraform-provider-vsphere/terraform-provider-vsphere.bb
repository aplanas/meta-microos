SUMMARY = "Terraform vSphere provider"
DESCRIPTION = "This is a terraform provider that lets you provision servers on a VMWare vSphere server."
LICENSE = "MPL-2.0"

PV = "2.0.2"

RPM_NAME = "terraform-provider-vsphere-2.0.2-2.9.aarch64.rpm"
RPM_HASH = "2ca4bbadff1981a07ef2620d36071638651b381ca23a65720904f8cb92eb7f28e062b434572528ef84b38b8856aa0f11baa8c9221c427b10044b7a8b55837ae1"

RPROVIDES:${PN} += "terraform-provider-vsphere"

RDEPENDS:${PN} += "mkisofs \
terraform"

inherit rpm
