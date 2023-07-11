SUMMARY = "Pretty-printing library"
DESCRIPTION = "This library provides a lean alternative to the Format 1 module of the OCaml standard library. \
 \
Pp uses the same concepts of boxes and break hints, and the final rendering is done to formatter from the Format module."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ocaml-pp-1.1.2-4.2.aarch64.rpm"
RPM_HASH = "e1d787b878f13690c64cf7cb3f7e2d17f34dd10f3de6d59f88b2bc4635cfadfef5abc390043e83fc6b0e5abb86e1b0c54e83c2aaecfda81827c5a9b767fe667c"

RPROVIDES:${PN} += "ocaml-pp"

RDEPENDS:${PN} += ""

inherit rpm
