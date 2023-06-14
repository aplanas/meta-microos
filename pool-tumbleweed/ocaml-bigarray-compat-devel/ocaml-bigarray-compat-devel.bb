SUMMARY = "Development files for ocaml-bigarray-compat"
DESCRIPTION = "The ocaml-bigarray-compat-devel package contains libraries and signature files for \
developing applications that use ocaml-bigarray-compat."
LICENSE = "ISC"

PV = "1.1.0"

RPM_NAME = "ocaml-bigarray-compat-devel-1.1.0-1.9.aarch64.rpm"
RPM_HASH = "2fcef8cd1dc3df5467a6e3e287864d61da7df551d2f17f3356973aab3eb90adca004c9edb55dc72f56f5dd442489da35f158be1d7c3a9371c52e3cb800cb4f54"

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
