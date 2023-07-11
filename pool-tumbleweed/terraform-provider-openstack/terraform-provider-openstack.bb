SUMMARY = "Terraform OpenStack provider"
DESCRIPTION = "This is a terraform provider that lets you provision servers on an OpenStack platform via Terraform."
LICENSE = "MPL-2.0"

PV = "1.43.0"

RPM_NAME = "terraform-provider-openstack-1.43.0-2.10.aarch64.rpm"
RPM_HASH = "564bae39e7ffb4e21bed70f5893b894df067a830978058bff094dbe9492d7aa94db19978536f4f4b12f9583d9b84cb8994218526a2402075cc3bfd6e0859fac7"

RPROVIDES:${PN} += "terraform-provider-openstack"

RDEPENDS:${PN} += "mkisofs \
terraform"

inherit rpm
