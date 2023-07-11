SUMMARY = "Development files for ocaml-pp"
DESCRIPTION = "The ocaml-pp-devel package contains libraries and signature files for \
developing applications that use ocaml-pp."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ocaml-pp-devel-1.1.2-4.2.aarch64.rpm"
RPM_HASH = "a6a8420d710fd249bdb720576789c3fba54bd9a082df31c9cb07558945ecb37cbb9dd87d3b4d8506768a92a0b589db0dc7334dd5bd89bf62b559d362d126d0f0"

RPROVIDES:${PN} += "ocaml-Pp \
ocaml-pp-devel \
ocamlfind-pp \
ocamlx-Pp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-pp \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Printf"

inherit rpm
