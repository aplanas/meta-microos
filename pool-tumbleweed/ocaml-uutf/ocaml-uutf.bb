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

RPM_NAME = "ocaml-uutf-1.0.3-1.9.aarch64.rpm"
RPM_HASH = "0ab2025fd9a64a70ca51160a9d36a3f7d665065b66a2fccf3195e653005e56b2ab045fcc9a78644ccd8133d0c2f07ca84a6eed91b1862e4ab389411f9b3b6696"

RPROVIDES:${PN} += "ocaml-uutf"

RDEPENDS:${PN} += ""

inherit rpm
