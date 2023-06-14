SUMMARY = "Development files for ocaml-integers"
DESCRIPTION = "The ocaml-integers-devel package contains libraries and signature files for \
developing applications that use ocaml-integers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "ocaml-integers-devel-0.7.0-1.11.aarch64.rpm"
RPM_HASH = "d49ae0e0b8c858b6acf25159a4900d9f0a40a829ddf3ac9aa78ceec33d00d15002e4d1d7f15a3eef6388a93b1820ee020039445eb5c4782255dc0637e40e4a65"

RPROVIDES:${PN} += "ocaml-Install-integer-printers \
ocaml-Integer-printers \
ocaml-Signed \
ocaml-Unsigned \
ocaml-integers-devel \
ocamlfind-integers \
ocamlfind-integers.top \
ocamlx-Signed \
ocamlx-Unsigned"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Env \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Misc \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Warnings \
ocaml-integers \
ocamlfind-compiler-libs \
ocamlfind-stdlib-shims \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64"

inherit rpm
