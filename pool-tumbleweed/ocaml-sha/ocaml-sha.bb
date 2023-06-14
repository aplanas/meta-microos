SUMMARY = "Binding to the SHA cryptographic functions"
DESCRIPTION = "A binding for SHA interface code in OCaml. Offering the same interface than \
the MD5 digest included in the OCaml standard library. \
It's currently providing SHA1, SHA256 and SHA512 hash functions."
LICENSE = "ISC"

PV = "1.15.2"

RPM_NAME = "ocaml-sha-1.15.2-1.11.aarch64.rpm"
RPM_HASH = "113c4e6b90cdcb0181edbc4ebb543a7cea088f8d75324be75c64057d40e6c69f5f76f48a6486a0a7e3d898843bc0def9908af8324897d5d70aab5bd2207828d1"

RPROVIDES:${PN} += "ocaml-sha"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
