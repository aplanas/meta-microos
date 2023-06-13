SUMMARY = "QuickCheck inspired property-based testing for OCaml"
DESCRIPTION = "This module allows to check invariants (properties of some types) over \
randomly generated instances of the type. It provides combinators for \
generating instances and printing them."
LICENSE = "BSD-2-Clause"

PV = "0.21.1"

RPM_NAME = "ocaml-qcheck-0.21.1-1.1.aarch64.rpm"
RPM_HASH = "cf3fc58650e70bba0cd7529c93fab20e8fba34563ddd6d37e382af3ea6c67059e994f88e858c8296c5abe38ef07f0f710876030328a141f01ea4a5d959873041"

RPROVIDES:${PN} += "ocaml-qcheck \
ocaml-qcheck(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
