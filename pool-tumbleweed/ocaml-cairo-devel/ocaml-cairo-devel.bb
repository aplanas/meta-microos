SUMMARY = "Development files for ocaml-cairo"
DESCRIPTION = "The ocaml-cairo-devel package contains libraries and signature files for \
developing applications that use ocaml-cairo."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.4"

RPM_NAME = "ocaml-cairo-devel-0.6.4-2.4.aarch64.rpm"
RPM_HASH = "02cd7822525eed6b06dc40212931ec64e7c4e9eec8cffc73d186079b42568bc7428717d52bd5131cd226aefdf936b0f7aa640a87d39d3aa4b090fa318585a097"

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
