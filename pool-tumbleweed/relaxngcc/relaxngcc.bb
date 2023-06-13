SUMMARY = "RELAX NG Compiler Compiler"
DESCRIPTION = "RelaxNGCC is a tool for generating Java source code from a given RELAX NG \
grammar. By embedding code fragments in the grammar like yacc or JavaCC, you can \
take appropriate actions while parsing valid XML documents against the grammar."
LICENSE = "Apache-1.1"

PV = "1.12"

RPM_NAME = "relaxngcc-1.12-3.3.noarch.rpm"
RPM_HASH = "f75ebd5b1d7c70ffdc54de7f6b6a9e1a08cfcc13ef7c69be4d72e128d785c349834b9da693f594526c381d35917584da72b0911dc24cd552dda5d5917d13a686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "relaxngcc"

RDEPENDS:${PN} += "isorelax \
msv-msv \
msv-xsdlib \
relaxngDatatype \
xerces-j2 \
xml-commons-apis"

inherit rpm
