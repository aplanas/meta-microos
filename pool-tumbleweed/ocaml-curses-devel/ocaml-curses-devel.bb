SUMMARY = "Development files for ocaml-curses"
DESCRIPTION = "The ocaml-curses-devel package contains libraries and signature files for \
developing applications that use ocaml-curses."
LICENSE = "LGPL-2.1+"

PV = "1.0.11"

RPM_NAME = "ocaml-curses-devel-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "e3332dc244c3a06a00fa65573789c6e20d0333c190dc7d145093447398b5cf933dad49d9bcbb7d7724612fde7b974942850152fcb2140c032312f9b7ecce0af9"

RPROVIDES:${PN} += "ocaml-Curses \
ocaml-curses-devel \
ocamlfind-curses \
ocamlx-Curses"

RDEPENDS:${PN} += "libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
ncurses-devel \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Unix \
ocaml-curses \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List"

inherit rpm
