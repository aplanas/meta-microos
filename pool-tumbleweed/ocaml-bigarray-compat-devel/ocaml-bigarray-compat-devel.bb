SUMMARY = "Development files for ocaml-bigarray-compat"
DESCRIPTION = "The ocaml-bigarray-compat-devel package contains libraries and signature files for \
developing applications that use ocaml-bigarray-compat."
LICENSE = "ISC"

PV = "1.1.0"

RPM_NAME = "ocaml-bigarray-compat-devel-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "55fa5f3ab9dff41d0cd84c39ca5c982f4ef8cf888b6c5e4ba20f440209ce5928a7a8293eb4e7167a4b2959e3839d850d6a7367d496e1e42462139f0ce4c20f4d"

RPROVIDES:${PN} += "ocaml-Bigarray-compat \
ocaml-bigarray-compat-devel \
ocamlfind-bigarray-compat \
ocamlx-Bigarray-compat"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Complex \
ocaml-bigarray-compat \
ocamlx-Stdlib--Bigarray"

inherit rpm
