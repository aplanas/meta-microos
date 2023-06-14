SUMMARY = "Pretty-printing library"
DESCRIPTION = "This library provides a lean alternative to the Format 1 module of the OCaml standard library. \
 \
Pp uses the same concepts of boxes and break hints, and the final rendering is done to formatter from the Format module."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ocaml-pp-1.1.2-4.1.aarch64.rpm"
RPM_HASH = "f36d4b77a4caab01e95d887ed71419daec5f79e3b531bb5dedef1f409b31edbb2e6c0ec1a1c163b3b37179a26c3e00c742aff93cc94072e83b5b6a20edce6caf"

RPROVIDES:${PN} += "ocaml-pp"

RDEPENDS:${PN} += ""

inherit rpm
