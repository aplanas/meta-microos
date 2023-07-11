SUMMARY = "RELAX NG Compiler Compiler"
DESCRIPTION = "RelaxNGCC is a tool for generating Java source code from a given RELAX NG \
grammar. By embedding code fragments in the grammar like yacc or JavaCC, you can \
take appropriate actions while parsing valid XML documents against the grammar."
LICENSE = "Apache-1.1"

PV = "1.12"

RPM_NAME = "relaxngcc-1.12-3.4.noarch.rpm"
RPM_HASH = "776ac1e1995dc0cc439597382f999e133a8f212454d1603cbc2a0fc46c45d565c130df7e8e6eab6ecd58952a58c11899b7cf450f6ce7095725b37cbd063edd58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "relaxngcc"

RDEPENDS:${PN} += "isorelax \
msv-msv \
msv-xsdlib \
relaxngDatatype \
xerces-j2 \
xml-commons-apis"

inherit rpm
