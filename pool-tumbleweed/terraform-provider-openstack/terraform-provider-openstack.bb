SUMMARY = "Terraform OpenStack provider"
DESCRIPTION = "This is a terraform provider that lets you provision servers on an OpenStack platform via Terraform."
LICENSE = "MPL-2.0"

PV = "1.43.0"

RPM_NAME = "terraform-provider-openstack-1.43.0-2.9.aarch64.rpm"
RPM_HASH = "19bccd19fc333ab2f5a883ecb0f76261d54bef34375f07518c5cbeb4aabf8723d0e9be82acd0999475141b4f8e3f07b8f6d648c2991f1a7c2c6bb52bb71ac707"

RPROVIDES:${PN} += "terraform-provider-openstack \
terraform-provider-openstack(aarch-64)"

RDEPENDS:${PN} += "mkisofs \
terraform"

inherit rpm
