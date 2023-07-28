SUMMARY = "QuickCheck inspired property-based testing for OCaml"
DESCRIPTION = "This module allows to check invariants (properties of some types) over \
randomly generated instances of the type. It provides combinators for \
generating instances and printing them."
LICENSE = "BSD-2-Clause"

PV = "0.21.1"

RPM_NAME = "ocaml-qcheck-0.21.1-1.2.aarch64.rpm"
RPM_HASH = "f5707ffb573c562a2c094f4c977c124e885a595676fb9ec620c5c48585de303e649d529851ca5127d69acead1632e3fc1131526edf30e0e6b67bcc6c9238ecb3"

RPROVIDES:${PN} += "ocaml-qcheck"

RDEPENDS:${PN} += ""

inherit rpm
