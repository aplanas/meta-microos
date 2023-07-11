SUMMARY = "Development files for ocaml-cppo"
DESCRIPTION = "The ocaml-cppo-devel package contains libraries and signature files for \
developing applications that use ocaml-cppo."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ocaml-cppo-devel-1.6.9-1.5.aarch64.rpm"
RPM_HASH = "f0bb30d4f84bfe78568fe5d46042da4e790da5ac78d7ba805ce1a1fcc17a01c706c5cd9040f62c81a1db48256dbb5588f1043b1ee2bdf80d6f3877b656c10bdb"

RPROVIDES:${PN} += "ocaml-cppo-devel \
ocamlfind-cppo"

RDEPENDS:${PN} += "ocaml-cppo"

inherit rpm
