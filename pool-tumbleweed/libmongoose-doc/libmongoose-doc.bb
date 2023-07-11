SUMMARY = "Documentation for libmongoose"
DESCRIPTION = "Documentation for libmongoose."
LICENSE = "GPL-3.0-only"

PV = "5.13.0"

RPM_NAME = "libmongoose-doc-5.13.0-49.2.aarch64.rpm"
RPM_HASH = "56c6c28960550a5cc8c292b3657b61e267dcbdd7b917f32178b9ab01426dde155da7f84c7b5131d712b527a0ba962aadce7126f31e61122799eb5f579e44dfe8"

RPROVIDES:${PN} += "libmongoose-doc"

RDEPENDS:${PN} += ""

inherit rpm
