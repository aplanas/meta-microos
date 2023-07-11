SUMMARY = "Non-blocking streaming Unicode codec for OCaml"
DESCRIPTION = "Uutf is a non-blocking streaming codec to decode and encode the UTF-8, \
UTF-16, UTF-16LE and UTF-16BE encoding schemes. It can efficiently \
work character by character without blocking on IO. Decoders perform \
character position tracking and support newline normalization. \
 \
Functions are also provided to fold over the characters of UTF encoded \
OCaml string values and to directly encode characters in OCaml \
Buffer.t values."
LICENSE = "ISC"

PV = "1.0.3"

RPM_NAME = "ocaml-uutf-1.0.3-1.10.aarch64.rpm"
RPM_HASH = "074ed23d246f3ae579497970c7b5ae860ba664f68f6faca0e73dbc41a20c959b192b6ac009f53310ae3e668f9cf883d1eb0f906cc2d7f33cbcb579496e4b06b0"

RPROVIDES:${PN} += "ocaml-uutf"

RDEPENDS:${PN} += ""

inherit rpm
