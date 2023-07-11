SUMMARY = "Development files for ocaml-stdlib-shims"
DESCRIPTION = "The ocaml-stdlib-shims-devel package contains libraries and signature files for \
developing applications that use ocaml-stdlib-shims."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.3.0"

RPM_NAME = "ocaml-stdlib-shims-devel-0.3.0-1.12.aarch64.rpm"
RPM_HASH = "4be94f80751b2f08cd04b45c6aa0b1d1a001c5409c42359363f03db6855762c04d300c29be4fe59cb8eb53f0515cfc034c358abec3bac870c66f259603375187"

RPROVIDES:${PN} += "ocaml-stdlib-shims-devel \
ocamlfind-stdlib-shims"

RDEPENDS:${PN} += "ocaml-stdlib-shims"

inherit rpm
