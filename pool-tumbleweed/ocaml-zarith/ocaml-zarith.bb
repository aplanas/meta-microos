SUMMARY = "Arbitrary precision integers"
DESCRIPTION = "The Zarith library implements arithmetic and logical operations over arbitrary-precision integers and rational numbers."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "1.13"

RPM_NAME = "ocaml-zarith-1.13-1.1.aarch64.rpm"
RPM_HASH = "126446dc3d0766b5619e69e063180ad99ad26e109c0ab5e418f91669d8a4354b24c6510613cf17ee325d32cbd828782fb3e5c994fd76752a19faed11ad80c253"

RPROVIDES:${PN} += "ocaml-zarith"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10"

inherit rpm
