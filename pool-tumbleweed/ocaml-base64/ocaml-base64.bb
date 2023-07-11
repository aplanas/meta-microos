SUMMARY = "Base64 encoding and decoding in OCaml"
DESCRIPTION = "Base64 for OCaml. Base64 is a group of similar binary-to-text encoding schemes \
that represent binary data in an ASCII string format by translating it into a \
radix-64 representation. It is specified in RFC 4648."
LICENSE = "ISC"

PV = "3.5.1"

RPM_NAME = "ocaml-base64-3.5.1-1.4.aarch64.rpm"
RPM_HASH = "61d6149c6c96ce855627788b890c77f7fdd9bd2750e8b8d5f20841385afa21be85f3e89e75d935262e7dd7691a6b5dbed3cfde5e2ce322b0f63591f15e6d24ab"

RPROVIDES:${PN} += "ocaml-base64"

RDEPENDS:${PN} += ""

inherit rpm
