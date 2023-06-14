SUMMARY = "Source-based package manager for OCaml"
DESCRIPTION = "OPAM is a source-based package manager for OCaml. It supports multiple \
simultaneous compiler installations, flexible package constraints, and a \
Git-friendly development workflow."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "aa8ecff1eb9e6096506f7502fc603bfd2635c17364084287c9ddefdffdb76fb948810620fa35ae751139aec6d7314a3a6b45f788defd10d26d4ed09b85c41baa"

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
