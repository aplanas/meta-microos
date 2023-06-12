SUMMARY = "Development files for ocaml-gen"
DESCRIPTION = "The ocaml-gen-devel package contains libraries and signature files for \
developing applications that use ocaml-gen."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ocaml-gen-devel-1.1-1.1.aarch64.rpm"
RPM_HASH = "9fdee52b9a7fe5f1952fab0b993b1202d2d871b0fa5761d19c5e4567514ed1a3641e1b3d30a2945a66934c8b8be5b6b8c5d039cbb189d5a530f51f930ea1f0b7"

RPROVIDES:${PN} += "ocaml(Gen) \
ocaml(GenClone) \
ocaml(GenLabels) \
ocaml(GenLabels_intf) \
ocaml(GenM) \
ocaml(GenMList) \
ocaml(GenM_intf) \
ocaml(GenShims_) \
ocaml(Gen_intf) \
ocaml-gen-devel \
ocaml-gen-devel(aarch-64) \
ocamlfind(gen) \
ocamlx(Gen) \
ocamlx(GenClone) \
ocamlx(GenLabels) \
ocamlx(GenLabels_intf) \
ocamlx(GenM) \
ocamlx(GenMList) \
ocamlx(GenM_intf) \
ocamlx(GenShims_) \
ocamlx(Gen_intf)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalOO) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Uchar) \
ocaml-gen \
ocamlfind(seq) \
ocamlx(CamlinternalOO) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Random)"

inherit rpm
