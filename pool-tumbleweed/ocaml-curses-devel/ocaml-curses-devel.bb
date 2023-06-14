SUMMARY = "Development files for ocaml-curses"
DESCRIPTION = "The ocaml-curses-devel package contains libraries and signature files for \
developing applications that use ocaml-curses."
LICENSE = "LGPL-2.1+"

PV = "1.0.11"

RPM_NAME = "ocaml-curses-devel-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "b299bb5a051b6ff0f0792e95a41891edb365ff0e005b833a09ef24b47bb9900bbb2c180d51f7c645eac143c9f0a0b0155b3314256e535e2852d91fa7a02a56e1"

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
