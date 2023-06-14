SUMMARY = "Development files for ocaml-uutf"
DESCRIPTION = "The ocaml-uutf-devel package contains libraries and signature files for \
developing applications that use ocaml-uutf."
LICENSE = "ISC"

PV = "1.0.3"

RPM_NAME = "ocaml-uutf-devel-1.0.3-1.9.aarch64.rpm"
RPM_HASH = "1e63e131ee7d350b8e398bf266f441f471324944617f866baa802d001bd139ef2694613246a11159c7906e89392b29280744d91d8d749c469c0905bb75bc6b7d"

RPROVIDES:${PN} += "ocaml-Uutf \
ocaml-uutf-devel \
ocamlfind-uutf \
ocamlx-Uutf"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-uutf \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Uchar"

inherit rpm
