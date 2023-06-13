SUMMARY = "Development files for ocaml-stdlib-shims"
DESCRIPTION = "The ocaml-stdlib-shims-devel package contains libraries and signature files for \
developing applications that use ocaml-stdlib-shims."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "0.3.0"

RPM_NAME = "ocaml-stdlib-shims-devel-0.3.0-1.11.aarch64.rpm"
RPM_HASH = "c0a550215c99983e744068e2ab83a67dbc6d54caa47e215db9f0362cc7f0e3ac0bcef1f8b5abf654183af037934574ef6ef6167f1bf6dda1acb2a4bcc18967dc"

RPROVIDES:${PN} += "ocaml-stdlib-shims-devel \
ocaml-stdlib-shims-devel(aarch-64) \
ocamlfind(stdlib-shims)"

RDEPENDS:${PN} += "ocaml-stdlib-shims"

inherit rpm
