SUMMARY = "Binding to the SHA cryptographic functions"
DESCRIPTION = "A binding for SHA interface code in OCaml. Offering the same interface than \
the MD5 digest included in the OCaml standard library. \
It's currently providing SHA1, SHA256 and SHA512 hash functions."
LICENSE = "ISC"

PV = "1.15.2"

RPM_NAME = "ocaml-sha-1.15.2-1.12.aarch64.rpm"
RPM_HASH = "bcce47cd66c4dd3b063b3b335f7c06c208f17973b8087d22ec8ee87b3ca97ce4084393bbaa6950bc7a042a6e36160a284d47e867035984f23e8cacb2a2e118c3"

RPROVIDES:${PN} += "ocaml-sha"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
