SUMMARY = "A debugger for debugging and testing of Erlang programs"
DESCRIPTION = "A debugger for debugging and testing of Erlang programs."
LICENSE = "Apache-2.0"

PV = "25.3.2.2"

RPM_NAME = "erlang-debugger-25.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "421c330c9f5fb153c01eeffd5ba7351ca46eb18a0a605e3c6cba5ac2afa04474ace68ecc8b93dadd771aa08278a4024cc65bc4d0ee21a9c2c58009cf55635ee5"

RPROVIDES:${PN} += "erlang-debugger"

RDEPENDS:${PN} += "erlang \
erlang-wx"

inherit rpm
