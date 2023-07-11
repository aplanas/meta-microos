SUMMARY = "Simple and flexible tool for managing secrets"
DESCRIPTION = "Simple and flexible tool for managing secrets"
LICENSE = "MPL-2.0"

PV = "3.7.3"

RPM_NAME = "sops-3.7.3-1.7.aarch64.rpm"
RPM_HASH = "f60859d5c22bdd7a5d311c83fbbe3a2af8dd4d6f5f27ec91eda7c6920242b2f3ea19663470cc24b5f609beb6403deb740b95c7e8e6acf3ac3b2dafa616687f53"

RPROVIDES:${PN} += "sops"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
