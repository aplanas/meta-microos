SUMMARY = "Development files for ocaml-csexp"
DESCRIPTION = "The ocaml-csexp-devel package contains libraries and signature files for \
developing applications that use ocaml-csexp."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-devel-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "01c82ee5fbc78c4d496b5a163e8e139c27b30869630e1ff2c481fe99407f9060e5503ac3fb92344bab0c903bdc1d2763ee1eb895247b0bf3120cdc2b03903fe5"

RPROVIDES:${PN} += "ocaml(Csexp) \
ocaml-csexp-devel \
ocaml-csexp-devel(aarch-64) \
ocamlfind(csexp) \
ocamlx(Csexp)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml-csexp \
ocamlx(Stdlib) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys)"

inherit rpm
