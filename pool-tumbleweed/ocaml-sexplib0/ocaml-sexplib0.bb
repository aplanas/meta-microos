SUMMARY = "Library containing the definition of S-expressions and some base converters"
DESCRIPTION = "Library containing the definition of S-expressions and some base converters."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "ocaml-sexplib0-0.16.0-1.2.aarch64.rpm"
RPM_HASH = "83f30ff0b900094cd95806f0d9289f1e3c4ba8075af6b9abbd0a2c2e89aca8925db76e82906a747287cc8356bd9649d05ceed1d48039a16b4c05ea8fed8b9d36"

RPROVIDES:${PN} += "ocaml-sexplib0"

RDEPENDS:${PN} += ""

inherit rpm
