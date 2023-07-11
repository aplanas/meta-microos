SUMMARY = "Development files for ocaml-augeas"
DESCRIPTION = "The ocaml-augeas-devel package contains libraries and signature files for \
developing applications that use ocaml-augeas."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "ocaml-augeas-devel-0.6-1.4.aarch64.rpm"
RPM_HASH = "9d2a942357bda20daa3c74cda420edb55125c521af57737b668e33bff5b656722042d4e70bec56e7a562f7b17ed1fab4c166b12aa440d6e0e3d2afa12ea355ab"

RPROVIDES:${PN} += "ocaml-augeas-devel"

RDEPENDS:${PN} += "ocaml-augeas"

inherit rpm
