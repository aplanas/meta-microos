SUMMARY = "Development files for ocaml-menhir"
DESCRIPTION = "The ocaml-menhir-devel package contains libraries and signature files for \
developing applications that use ocaml-menhir."
LICENSE = "LGPL-2.0"

PV = "20230415"

RPM_NAME = "ocaml-menhir-devel-20230415-1.1.aarch64.rpm"
RPM_HASH = "b61b1fcf932e8fdb6b42609c5afe677be15529342ae074966859459cd1202e72eb2272af3ea51791340053176f9d79592957051a2146167d3534bfc67714f598"

RPROVIDES:${PN} += "ocaml(MenhirLib) \
ocaml(MenhirSdk) \
ocaml(MenhirSdk__Cmly_api) \
ocaml(MenhirSdk__Cmly_format) \
ocaml(MenhirSdk__Cmly_read) \
ocaml(MenhirSdk__Keyword) \
ocaml(MenhirSdk__Version) \
ocaml-menhir-devel \
ocaml-menhir-devel(aarch-64) \
ocamlfind(menhir) \
ocamlfind(menhirLib) \
ocamlfind(menhirSdk) \
ocamlx(MenhirLib) \
ocamlx(MenhirSdk) \
ocamlx(MenhirSdk__Cmly_api) \
ocamlx(MenhirSdk__Cmly_format) \
ocamlx(MenhirSdk__Cmly_read) \
ocamlx(MenhirSdk__Keyword) \
ocamlx(MenhirSdk__Version)"

RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml-menhir \
ocamlx(CamlinternalLazy) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys)"

inherit rpm
