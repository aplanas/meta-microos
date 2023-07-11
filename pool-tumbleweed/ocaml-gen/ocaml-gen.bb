SUMMARY = "Simple, efficient iterators for OCaml"
DESCRIPTION = "Iterators for OCaml, both restartable and consumable. \
The implementation keeps a good balance between simplicity and performance."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ocaml-gen-1.1-1.2.aarch64.rpm"
RPM_HASH = "78aee78d6a6868ac3985fd3524b3ee8c449cf543dee9462b4f2c32c5f3addaf93fcfbd137aae0b52cc26465aec212024161efe041d95d48d7a0cbabc6e7829b5"

RPROVIDES:${PN} += "ocaml-gen"

RDEPENDS:${PN} += ""

inherit rpm
