SUMMARY = "Development files for ocaml-csexp"
DESCRIPTION = "The ocaml-csexp-devel package contains libraries and signature files for \
developing applications that use ocaml-csexp."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-devel-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "01c82ee5fbc78c4d496b5a163e8e139c27b30869630e1ff2c481fe99407f9060e5503ac3fb92344bab0c903bdc1d2763ee1eb895247b0bf3120cdc2b03903fe5"

RPROVIDES:${PN} += "ocaml-Csexp \
ocaml-csexp-devel \
ocamlfind-csexp \
ocamlx-Csexp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-csexp \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
