SUMMARY = "Arbitrary precision integers"
DESCRIPTION = "The Zarith library implements arithmetic and logical operations over arbitrary-precision integers and rational numbers."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "1.12"

RPM_NAME = "ocaml-zarith-1.12-1.16.aarch64.rpm"
RPM_HASH = "085cbe87fcab411c9d6ad73de20b6235a908d29456236098a428d401ff1cfb88d1e6a3f94bfe590bf191d31e5420929db370ded85b24bfb088e374564ad14d90"

RPROVIDES:${PN} += "ocaml-zarith"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10"

inherit rpm
