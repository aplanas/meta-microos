SUMMARY = "Base64 encoding and decoding in OCaml"
DESCRIPTION = "Base64 for OCaml. Base64 is a group of similar binary-to-text encoding schemes \
that represent binary data in an ASCII string format by translating it into a \
radix-64 representation. It is specified in RFC 4648."
LICENSE = "ISC"

PV = "3.5.1"

RPM_NAME = "ocaml-base64-3.5.1-1.3.aarch64.rpm"
RPM_HASH = "902edb5998343f751023f44f78b3b3d5afc76cd0bd77503ea256fb01060e03ed20aa271cdd0a79ea68bc28a0ea1a14d6c87af059ebc10cf83407991abf0bc9bf"

RPROVIDES:${PN} += "ocaml-base64 \
ocaml-base64(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
