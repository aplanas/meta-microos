SUMMARY = "Library containing the definition of S-expressions and some base converters"
DESCRIPTION = "Library containing the definition of S-expressions and some base converters."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "ocaml-sexplib0-0.16.0-1.1.aarch64.rpm"
RPM_HASH = "09ae5d4d58c890744fe48797e302193cc4c71f2111191c7ce30261ec163a15353498cd2181f309e30660a991f5f4955727a52dda39dbe6688372edc9c95a31e2"

RPROVIDES:${PN} += "ocaml-sexplib0"

RDEPENDS:${PN} += ""

inherit rpm
