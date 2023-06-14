SUMMARY = "Arbitrary precision integers"
DESCRIPTION = "The Zarith library implements arithmetic and logical operations over arbitrary-precision integers and rational numbers."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "1.12"

RPM_NAME = "ocaml-zarith-1.12-1.15.aarch64.rpm"
RPM_HASH = "7b8cdc38393ffed00b5991296e1d6237b62de5de5e4a86690bc0b7a29d542fbc53b49ad7d8d2f58d004ed9426a636b45369757b3ba7b69f77f48fe0d200c172a"

RPROVIDES:${PN} += "ocaml-zarith"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10"

inherit rpm
