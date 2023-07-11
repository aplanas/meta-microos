SUMMARY = "Terraform null-provider"
DESCRIPTION = "This is a terraform provider that lets you use null files"
LICENSE = "MPL-2.0"

PV = "3.1.0"

RPM_NAME = "terraform-provider-null-3.1.0-2.10.aarch64.rpm"
RPM_HASH = "969a544751546c2de0c2d46dc894e1a6ba021212f13f126e251baa51b9cc9c968bf9d66ca7d696982836a37601020174448c6e13662544418b57d33b5bc05d4b"

RPROVIDES:${PN} += "terraform-provider-null"

RDEPENDS:${PN} += "terraform"

inherit rpm
