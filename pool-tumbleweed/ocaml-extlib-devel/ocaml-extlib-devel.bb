SUMMARY = "Development files for ocaml-extlib"
DESCRIPTION = "The ocaml-extlib-devel package contains libraries and signature files for \
developing applications that use ocaml-extlib."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "1.7.9"

RPM_NAME = "ocaml-extlib-devel-1.7.9-2.4.aarch64.rpm"
RPM_HASH = "3af9dae74202c324966df2d653126cf3c82377c8b1bdba372f9a44fa3edfd6bd65f821613c86f86db428f04c2719d2fb14391dbde4bb3d16b0394dafad5b5ecc"

RPROVIDES:${PN} += "ocaml(BitSet) \
ocaml(Dllist) \
ocaml(DynArray) \
ocaml(Enum) \
ocaml(ExtArray) \
ocaml(ExtBuffer) \
ocaml(ExtBytes) \
ocaml(ExtHashtbl) \
ocaml(ExtLib) \
ocaml(ExtList) \
ocaml(ExtString) \
ocaml(Global) \
ocaml(IO) \
ocaml(OptParse) \
ocaml(Option) \
ocaml(PMap) \
ocaml(RefList) \
ocaml(Std) \
ocaml-extlib-devel \
ocaml-extlib-devel(aarch-64) \
ocamlfind(extlib) \
ocamlx(BitSet) \
ocamlx(Dllist) \
ocamlx(DynArray) \
ocamlx(Enum) \
ocamlx(ExtArray) \
ocamlx(ExtBuffer) \
ocamlx(ExtBytes) \
ocamlx(ExtHashtbl) \
ocamlx(ExtLib) \
ocamlx(ExtList) \
ocamlx(ExtString) \
ocamlx(Global) \
ocamlx(IO) \
ocamlx(OptParse) \
ocamlx(Option) \
ocamlx(PMap) \
ocamlx(RefList) \
ocamlx(Std)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalOO) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml-extlib \
ocamlx(CamlinternalOO) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Obj) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys)"

inherit rpm
