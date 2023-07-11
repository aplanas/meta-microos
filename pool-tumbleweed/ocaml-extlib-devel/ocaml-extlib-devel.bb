SUMMARY = "Development files for ocaml-extlib"
DESCRIPTION = "The ocaml-extlib-devel package contains libraries and signature files for \
developing applications that use ocaml-extlib."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.7.9"

RPM_NAME = "ocaml-extlib-devel-1.7.9-2.5.aarch64.rpm"
RPM_HASH = "1dc803299f1525ed8b339520a684593d2bb142bfba4935899a081d85d43b1f3d1a11cde091b0d5f1398e83545331c6eae7fed13999e05df63b895a8bf1c35fe4"

RPROVIDES:${PN} += "ocaml-BitSet \
ocaml-Dllist \
ocaml-DynArray \
ocaml-Enum \
ocaml-ExtArray \
ocaml-ExtBuffer \
ocaml-ExtBytes \
ocaml-ExtHashtbl \
ocaml-ExtLib \
ocaml-ExtList \
ocaml-ExtString \
ocaml-Global \
ocaml-IO \
ocaml-OptParse \
ocaml-Option \
ocaml-PMap \
ocaml-RefList \
ocaml-Std \
ocaml-extlib-devel \
ocamlfind-extlib \
ocamlx-BitSet \
ocamlx-Dllist \
ocamlx-DynArray \
ocamlx-Enum \
ocamlx-ExtArray \
ocamlx-ExtBuffer \
ocamlx-ExtBytes \
ocamlx-ExtHashtbl \
ocamlx-ExtLib \
ocamlx-ExtList \
ocamlx-ExtString \
ocamlx-Global \
ocamlx-IO \
ocamlx-OptParse \
ocamlx-Option \
ocamlx-PMap \
ocamlx-RefList \
ocamlx-Std"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalOO \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-extlib \
ocamlx-CamlinternalOO \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Obj \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
