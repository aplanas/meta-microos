SUMMARY = "Source-based package manager for OCaml"
DESCRIPTION = "OPAM is a source-based package manager for OCaml. It supports multiple \
simultaneous compiler installations, flexible package constraints, and a \
Git-friendly development workflow."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-2.1.5-1.2.aarch64.rpm"
RPM_HASH = "f50ec4d82c452fc002ad948da7bb2b2eb021a0db9ddcc8bba21421c07b9b3639c9fb3736b25dc822e7b13266d2d540e91370fb70301fa06ddb6408fd28a39784"

RPROVIDES:${PN} += "opam"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
bubblewrap \
bzip2 \
curl \
diffutils \
gzip \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
opam-installer \
patch \
tar \
unzip"

inherit rpm
