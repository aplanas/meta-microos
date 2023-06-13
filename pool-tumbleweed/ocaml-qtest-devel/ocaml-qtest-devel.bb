SUMMARY = "Development files for ocaml-qtest"
DESCRIPTION = "The ocaml-qtest-devel package contains libraries and signature files for \
developing applications that use ocaml-qtest."
LICENSE = "GPL-3.0-or-later"

PV = "2.11.2"

RPM_NAME = "ocaml-qtest-devel-2.11.2-2.1.aarch64.rpm"
RPM_HASH = "0e284c580d28da2d0aa61b8ec8b2b0465eb6f35144c2e81bd9053ab3534fbd37bd2958a9b1ae2f7f5e45a790369d21c3337aed6cda2cbdcd8b83f4acb4daa8db"

RPROVIDES:${PN} += "ocaml(Qtestlib) \
ocaml-qtest-devel \
ocaml-qtest-devel(aarch-64) \
ocamlfind(qtest) \
ocamlfind(qtest.lib) \
ocamlx(Qtestlib)"

RDEPENDS:${PN} += "ocaml-qtest"

inherit rpm
