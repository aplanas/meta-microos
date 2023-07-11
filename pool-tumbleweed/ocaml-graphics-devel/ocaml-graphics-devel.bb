SUMMARY = "Development files for ocaml-graphics"
DESCRIPTION = "The ocaml-graphics-devel package contains libraries and signature files for \
developing applications that use ocaml-graphics."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "5.1.2"

RPM_NAME = "ocaml-graphics-devel-5.1.2-2.9.aarch64.rpm"
RPM_HASH = "6c515a2b418540b23e6a487368c4404620f7b2e54e9c9a7ab7254ebbb3e15c16d1c738537dc02a1ebbb5b76572b7f3e8b92de0a0badc173d5d832a7418cfa96e"

RPROVIDES:${PN} += "ocaml-Graphics \
ocaml-GraphicsX11 \
ocaml-graphics-devel \
ocaml-x11 \
ocamlfind-graphics \
ocamlx-Graphics \
ocamlx-GraphicsX11"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Sys \
ocaml-graphics \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Sys"

inherit rpm
