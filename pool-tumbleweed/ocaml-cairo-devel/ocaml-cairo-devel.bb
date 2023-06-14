SUMMARY = "Development files for ocaml-cairo"
DESCRIPTION = "The ocaml-cairo-devel package contains libraries and signature files for \
developing applications that use ocaml-cairo."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.4"

RPM_NAME = "ocaml-cairo-devel-0.6.4-2.3.aarch64.rpm"
RPM_HASH = "569a21bb79c234816157e355b5fc94de17201b0878ad226af93fa33a64c6e287d92406752d5f7880fd2933934f2917ea4b3daa3f52a5671a0d7f21495248ac82"

RPROVIDES:${PN} += "ocaml-Cairo \
ocaml-cairo-devel \
ocamlfind-cairo2 \
ocamlx-Cairo"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--List \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-cairo \
ocamlfind-bigarray \
ocamlx-Stdlib \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
pkgconfig-cairo"

inherit rpm
