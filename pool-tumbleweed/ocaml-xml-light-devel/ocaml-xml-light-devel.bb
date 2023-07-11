SUMMARY = "Development files for ocaml-xml-light"
DESCRIPTION = "The ocaml-xml-light-devel package contains libraries and signature files for \
developing applications that use ocaml-xml-light."
LICENSE = "LGPL-2.1+"

PV = "2.5"

RPM_NAME = "ocaml-xml-light-devel-2.5-1.3.aarch64.rpm"
RPM_HASH = "2f2083817a2c708e01bff915cbe94be740b24eff00975409fab2e2cda6ce6c5effee10f48e418e3eb7bcc8a4ad3d9bb2c85ca657a6cf4a6d4d77e144979491cf"

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
