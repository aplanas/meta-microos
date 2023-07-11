SUMMARY = "Base library and tools for ppx rewriters"
DESCRIPTION = "The ppxlib project provides the basis for the ppx system, which is \
currently the officially supported method for meta-programming in \
OCaml. It offers a principled way to generate code at compile time in \
OCaml projects."
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "ocaml-ppxlib-0.29.1-3.2.aarch64.rpm"
RPM_HASH = "12ab992ef200f5c05ba07926831487f8b1ac4265d05f6c93002070f7d5b0a86cb93e30e8d8de6822314cdc59b1b01dd3315bf289e85db4290432f99f5df50ced"

RPROVIDES:${PN} += "ocaml-ppxlib"

RDEPENDS:${PN} += ""

inherit rpm
