SUMMARY = "Tool for validating modulemd data"
DESCRIPTION = "The modulemd-validator tool provides the facility for verifying \
constructed modulemd data is correct and usable."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "modulemd-validator-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "5166bf0e49e739b9a305c05437887c202417a49c674c55a02854d633c0633be302b048db01b283eee68122c18f7fc8825777d8c6d59d9055a7d7663792ead5ef"

RPROVIDES:${PN} += "modulemd-validator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmodulemd.so.2 \
libmodulemd2 \
libyaml-0.so.2"

inherit rpm
