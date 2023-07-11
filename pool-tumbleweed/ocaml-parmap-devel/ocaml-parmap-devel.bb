SUMMARY = "Development files for ocaml-parmap"
DESCRIPTION = "The ocaml-parmap-devel package contains libraries and signature files for \
developing applications that use ocaml-parmap."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-devel-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "03cbd9b5755d6d89e886857f869cf168db8902ab7719a1b17014ea00130cf23bff89b3afa08045e12ec60bc89f60bb8f172711e61ebe9979e48ec089acb34201"

RPROVIDES:${PN} += "ocaml-Bytearray \
ocaml-Parmap \
ocaml-Parmap-compat \
ocaml-Parmap-utils \
ocaml-Setcore \
ocaml-parmap-devel \
ocamlfind-parmap \
ocamlx-Bytearray \
ocamlx-Parmap \
ocamlx-Parmap-compat \
ocamlx-Parmap-utils \
ocamlx-Setcore"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Gc \
ocaml-Stdlib--List \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-parmap \
ocamlfind-bigarray \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bigarray \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Sys \
ocamlx-Unix"

inherit rpm
