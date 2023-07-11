SUMMARY = "Terraform provider for Amazon Web Services (AWS)"
DESCRIPTION = "This is a terraform provider that lets you provision servers on Amazon Web \
Services via Terraform."
LICENSE = "MPL-2.0"

PV = "3.51.0"

RPM_NAME = "terraform-provider-aws-3.51.0-2.10.aarch64.rpm"
RPM_HASH = "34ec1c455d747bf5353149c639eee1ed60b844745fa92b1582f57bd94e8c913c7ff8fbdff7e070942c7da2798bb704dfd465959c421091ca18daa6c5f1aadbea"

RPROVIDES:${PN} += "terraform-provider-aws"

RDEPENDS:${PN} += "terraform"

inherit rpm
