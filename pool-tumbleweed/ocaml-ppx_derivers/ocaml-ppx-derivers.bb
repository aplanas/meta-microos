SUMMARY = "Deriving plugin registry"
DESCRIPTION = "Ppx_derivers is a tiny package whose sole purpose is to allow \
ppx_deriving and ppx_type_conv to inter-operate gracefully when \
linked as part of the same ocaml-migrate-parsetree driver."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-1.2.1-4.9.aarch64.rpm"
RPM_HASH = "af12a2ae36a30843d906379cdc095b1997356776b9bad045f2cd0b6aae807de1378cbad15a9a86bf1c3ce0325b6b483cf6356de68e6ca5b257d8eb38b088e32d"

RPROVIDES:${PN} += "ocaml-ppx_derivers \
ocaml-ppx_derivers(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
