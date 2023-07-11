SUMMARY = "Development files for the Compatibility OCaml Result module"
DESCRIPTION = "Projects that want to use the new result type defined in OCaml >= 4.03 while \
staying compatible with older version of OCaml should use the Result module \
defined in this library. \
 \
This package contains development files for ocaml-result."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ocaml-result-devel-1.5-3.7.aarch64.rpm"
RPM_HASH = "7ac778e426da824c58d9c4b30ea35621fa0bcbb78b6847cba8e25e6b1978abec97d1dc8d1864b35523f0726ba4b47f44af1124ab51ce01f72aca167d1a6ffca3"

RPROVIDES:${PN} += "ocaml-Result \
ocaml-result-devel \
ocamlfind-result \
ocamlx-Result"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Either \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-result \
ocamlx-Stdlib--Result"

inherit rpm
