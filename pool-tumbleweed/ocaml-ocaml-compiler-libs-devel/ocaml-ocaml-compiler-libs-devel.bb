SUMMARY = "Development files for ocaml-ocaml-compiler-libs"
DESCRIPTION = "The ocaml-ocaml-compiler-libs-devel package contains libraries and signature files for \
developing applications that use ocaml-ocaml-compiler-libs."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "ocaml-ocaml-compiler-libs-devel-0.12.4-1.11.aarch64.rpm"
RPM_HASH = "fb676a5f5b65554620f74f9555e54679af092092ad4cc8801cff13a810f42aeebcc8bdc5f00f0fbdce7cb69be2c2b5514fa6248e735c0a6b73bef61fa2b7d1a2"

RPROVIDES:${PN} += "ocaml(Ocaml_bytecomp) \
ocaml(Ocaml_common) \
ocaml(Ocaml_optcomp) \
ocaml(Ocaml_shadow) \
ocaml(Ocaml_toplevel) \
ocaml-ocaml-compiler-libs-devel \
ocaml-ocaml-compiler-libs-devel(aarch-64) \
ocamlfind(ocaml-compiler-libs) \
ocamlfind(ocaml-compiler-libs.bytecomp) \
ocamlfind(ocaml-compiler-libs.common) \
ocamlfind(ocaml-compiler-libs.optcomp) \
ocamlfind(ocaml-compiler-libs.shadow) \
ocamlfind(ocaml-compiler-libs.toplevel) \
ocamlx(Ocaml_bytecomp) \
ocamlx(Ocaml_common) \
ocamlx(Ocaml_optcomp) \
ocamlx(Ocaml_shadow) \
ocamlx(Ocaml_toplevel)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml-ocaml-compiler-libs \
ocamlfind(compiler-libs.bytecomp) \
ocamlfind(compiler-libs.common) \
ocamlfind(compiler-libs.optcomp) \
ocamlfind(compiler-libs.toplevel)"

inherit rpm
