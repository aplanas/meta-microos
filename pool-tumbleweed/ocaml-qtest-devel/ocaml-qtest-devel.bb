SUMMARY = "Development files for ocaml-qtest"
DESCRIPTION = "The ocaml-qtest-devel package contains libraries and signature files for \
developing applications that use ocaml-qtest."
LICENSE = "GPL-3.0-or-later"

PV = "2.11.2"

RPM_NAME = "ocaml-qtest-devel-2.11.2-2.2.aarch64.rpm"
RPM_HASH = "7acb9dc6208b05b755f8e415dea48371550e8f0c0d16277d82aefffffe21f723e58b017b1f5faa755c13a065b98b3015b527f40d05dfb6cc997afc1074e31bbd"

RPROVIDES:${PN} += "ocaml-Qtestlib \
ocaml-qtest-devel \
ocamlfind-qtest \
ocamlfind-qtest.lib \
ocamlx-Qtestlib"

RDEPENDS:${PN} += "ocaml-qtest"

inherit rpm
