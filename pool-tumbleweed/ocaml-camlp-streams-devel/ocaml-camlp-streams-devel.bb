SUMMARY = "Development files for ocaml-camlp-streams"
DESCRIPTION = "The ocaml-camlp-streams-devel package contains libraries and signature files for \
developing applications that use ocaml-camlp-streams."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "5.0.1"

RPM_NAME = "ocaml-camlp-streams-devel-5.0.1-2.4.aarch64.rpm"
RPM_HASH = "8f52504c0a43d50d14b481085f46145f6380e6324a80775c0e6a7258e54217849b8340771565aaeda8d444b64192df4aaa231a71bcd343f77eec269d3c8330fd"

RPROVIDES:${PN} += "ocaml(Genlex) \
ocaml(Stream) \
ocaml-camlp-streams-devel \
ocaml-camlp-streams-devel(aarch-64) \
ocamlfind(camlp-streams) \
ocamlx(Genlex) \
ocamlx(Stream)"

RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Genlex) \
ocaml(Stdlib__Stream) \
ocaml-camlp-streams \
ocamlx(Stdlib__Genlex) \
ocamlx(Stdlib__Stream)"

inherit rpm
