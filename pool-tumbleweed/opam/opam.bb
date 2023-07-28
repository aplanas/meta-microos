SUMMARY = "Source-based package manager for OCaml"
DESCRIPTION = "OPAM is a source-based package manager for OCaml. It supports multiple \
simultaneous compiler installations, flexible package constraints, and a \
Git-friendly development workflow."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "d9beaf6f79f7fc5c8a11cfc1a7fc095e566a560e1573ab44c03e1b397e391323d587d96ba9bcde70fd904ff604e0b383747c4efa8d2aa00abe58db0447e3f041"

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
