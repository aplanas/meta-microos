SUMMARY = "Development files for ocaml-ocaml-compiler-libs"
DESCRIPTION = "The ocaml-ocaml-compiler-libs-devel package contains libraries and signature files for \
developing applications that use ocaml-ocaml-compiler-libs."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "ocaml-ocaml-compiler-libs-devel-0.12.4-1.12.aarch64.rpm"
RPM_HASH = "0102c568b2c2c13e233a2ece5185a9510ab08dfe90f63cc3e7b5b93e99da6543f801d076ada6d6c6f1dee92ccb6c2e56882dd6d810c9a4ef55225208ae4289ac"

RPROVIDES:${PN} += "ocaml-Ocaml-bytecomp \
ocaml-Ocaml-common \
ocaml-Ocaml-optcomp \
ocaml-Ocaml-shadow \
ocaml-Ocaml-toplevel \
ocaml-ocaml-compiler-libs-devel \
ocamlfind-ocaml-compiler-libs \
ocamlfind-ocaml-compiler-libs.bytecomp \
ocamlfind-ocaml-compiler-libs.common \
ocamlfind-ocaml-compiler-libs.optcomp \
ocamlfind-ocaml-compiler-libs.shadow \
ocamlfind-ocaml-compiler-libs.toplevel \
ocamlx-Ocaml-bytecomp \
ocamlx-Ocaml-common \
ocamlx-Ocaml-optcomp \
ocamlx-Ocaml-shadow \
ocamlx-Ocaml-toplevel"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-ocaml-compiler-libs \
ocamlfind-compiler-libs.bytecomp \
ocamlfind-compiler-libs.common \
ocamlfind-compiler-libs.optcomp \
ocamlfind-compiler-libs.toplevel"

inherit rpm
