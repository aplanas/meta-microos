SUMMARY = "Erlang retest library"
DESCRIPTION = "Erlang retest library."
LICENSE = "MIT"

PV = "1.1.1+git20160312.ffef7d0"

RPM_NAME = "erlang-retest-src-1.1.1+git20160312.ffef7d0-1.25.aarch64.rpm"
RPM_HASH = "1b79ac0c08e01f504423a0315918701e68852890add9bc0be319be405efcac38b90882ba1ca1ae60f454ba384a21dec9d6571bb0aca2a8a3ecadcfaadaf4678d"

RPROVIDES:${PN} += "erlang-retest-src"

RDEPENDS:${PN} += "erlang-retest"

inherit rpm
