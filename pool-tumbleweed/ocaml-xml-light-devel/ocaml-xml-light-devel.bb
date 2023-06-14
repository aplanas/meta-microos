SUMMARY = "Development files for ocaml-xml-light"
DESCRIPTION = "The ocaml-xml-light-devel package contains libraries and signature files for \
developing applications that use ocaml-xml-light."
LICENSE = "LGPL-2.1+"

PV = "2.5"

RPM_NAME = "ocaml-xml-light-devel-2.5-1.2.aarch64.rpm"
RPM_HASH = "e6414b92506b40420372627e0b90f59beed98617871b464a5caa68bf2070f0c5fdd251a7f0e8137026564e6a47253ad80b433d6744eb432b5c86426af36d4c7c"

RPROVIDES:${PN} += "ocaml-Dtd \
ocaml-Xml \
ocaml-Xml-lexer \
ocaml-Xml-light-dtd-check \
ocaml-Xml-light-errors \
ocaml-Xml-light-types \
ocaml-Xml-light-utils \
ocaml-Xml-parser \
ocaml-XmlParser \
ocaml-xml-light-devel \
ocamlfind-xml-light \
ocamlx-Dtd \
ocamlx-Xml \
ocamlx-Xml-lexer \
ocamlx-Xml-light-dtd-check \
ocamlx-Xml-light-errors \
ocamlx-Xml-light-utils \
ocamlx-Xml-parser \
ocamlx-XmlParser"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Stack \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-xml-light \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Stack \
ocamlx-Stdlib--String"

inherit rpm
