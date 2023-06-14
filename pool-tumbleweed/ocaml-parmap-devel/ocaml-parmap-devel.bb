SUMMARY = "Development files for ocaml-parmap"
DESCRIPTION = "The ocaml-parmap-devel package contains libraries and signature files for \
developing applications that use ocaml-parmap."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-devel-1.2.5-1.4.aarch64.rpm"
RPM_HASH = "e1a712e3631a5cdfc4dbb6d084e9a1b3a774710c75df0c02bea274aed82eb08f293246879cfe250bfe76508a92eee8238b79b410378571ca7d268467099156c3"

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
