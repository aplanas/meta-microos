SUMMARY = "Development files for ocaml-xml-light"
DESCRIPTION = "The ocaml-xml-light-devel package contains libraries and signature files for \
developing applications that use ocaml-xml-light."
LICENSE = "LGPL-2.1+"

PV = "2.5"

RPM_NAME = "ocaml-xml-light-devel-2.5-1.2.aarch64.rpm"
RPM_HASH = "e6414b92506b40420372627e0b90f59beed98617871b464a5caa68bf2070f0c5fdd251a7f0e8137026564e6a47253ad80b433d6744eb432b5c86426af36d4c7c"

RPROVIDES:${PN} += "ocaml(Dtd) \
ocaml(Xml) \
ocaml(XmlParser) \
ocaml(Xml_lexer) \
ocaml(Xml_light_dtd_check) \
ocaml(Xml_light_errors) \
ocaml(Xml_light_types) \
ocaml(Xml_light_utils) \
ocaml(Xml_parser) \
ocaml-xml-light-devel \
ocaml-xml-light-devel(aarch-64) \
ocamlfind(xml-light) \
ocamlx(Dtd) \
ocamlx(Xml) \
ocamlx(XmlParser) \
ocamlx(Xml_lexer) \
ocamlx(Xml_light_dtd_check) \
ocamlx(Xml_light_errors) \
ocamlx(Xml_light_utils) \
ocamlx(Xml_parser)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Stack) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Uchar) \
ocaml-xml-light \
ocamlx(Stdlib) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Stack) \
ocamlx(Stdlib__String)"

inherit rpm
