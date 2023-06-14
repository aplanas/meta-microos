SUMMARY = "Development files for ocaml-ppx_derivers"
DESCRIPTION = "The ocaml-ppx_derivers-devel package contains libraries and signature files for \
developing applications that use ocaml-ppx_derivers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-devel-1.2.1-4.9.aarch64.rpm"
RPM_HASH = "699b95d61eefa95f03f657edef9300b84658b8619edd760b102a73ffcda206acab03147157031628f28fab6c6d130bfb7b0eee8f33cadfac8935a89a1d9f16a7"

RPROVIDES:${PN} += "ocaml-Ppx-derivers \
ocaml-ppx-derivers-devel \
ocamlfind-ppx-derivers \
ocamlx-Ppx-derivers"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-ppx-derivers \
ocamlx-Stdlib \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Printf"

inherit rpm
