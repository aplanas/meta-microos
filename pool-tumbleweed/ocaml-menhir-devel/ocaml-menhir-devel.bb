SUMMARY = "Development files for ocaml-menhir"
DESCRIPTION = "The ocaml-menhir-devel package contains libraries and signature files for \
developing applications that use ocaml-menhir."
LICENSE = "LGPL-2.0"

PV = "20230415"

RPM_NAME = "ocaml-menhir-devel-20230415-1.1.aarch64.rpm"
RPM_HASH = "b61b1fcf932e8fdb6b42609c5afe677be15529342ae074966859459cd1202e72eb2272af3ea51791340053176f9d79592957051a2146167d3534bfc67714f598"

RPROVIDES:${PN} += "ocaml-MenhirLib \
ocaml-MenhirSdk \
ocaml-MenhirSdk--Cmly-api \
ocaml-MenhirSdk--Cmly-format \
ocaml-MenhirSdk--Cmly-read \
ocaml-MenhirSdk--Keyword \
ocaml-MenhirSdk--Version \
ocaml-menhir-devel \
ocamlfind-menhir \
ocamlfind-menhirLib \
ocamlfind-menhirSdk \
ocamlx-MenhirLib \
ocamlx-MenhirSdk \
ocamlx-MenhirSdk--Cmly-api \
ocamlx-MenhirSdk--Cmly-format \
ocamlx-MenhirSdk--Cmly-read \
ocamlx-MenhirSdk--Keyword \
ocamlx-MenhirSdk--Version"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-menhir \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
