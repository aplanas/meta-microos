SUMMARY = "Deriving plugin registry"
DESCRIPTION = "Ppx_derivers is a tiny package whose sole purpose is to allow \
ppx_deriving and ppx_type_conv to inter-operate gracefully when \
linked as part of the same ocaml-migrate-parsetree driver."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-1.2.1-4.10.aarch64.rpm"
RPM_HASH = "ab610731f2c2a5e4d5f1c5f154fb740054d520e87aff86c02c407259ea6912b32e2aea5fb421c040fafdec5333fe7e23129109d4ca05211dc0ff5892d8d2ce3b"

RPROVIDES:${PN} += "ocaml-ppx-derivers"

RDEPENDS:${PN} += ""

inherit rpm
