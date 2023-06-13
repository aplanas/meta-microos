SUMMARY = "RDF Parser Toolkit for Redland"
DESCRIPTION = "Rasqal is a library providing full support for querying Resource \
Description Framework (RDF) including parsing query syntaxes, \
constructing the queries, executing them and returning result formats. \
It currently handles the RDF Data Query Language (RDQL) and SPARQL \
Query language."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "rasqal-0.9.33-1.30.aarch64.rpm"
RPM_HASH = "5fee0d3f3a5459247ebf84b4fccc419c082d929ff208133f575602cea73e77566b6b307316ed540c1446cb4c9ba941bb36400d19b435f61bcfe4104b50fba368"

RPROVIDES:${PN} += "rasqal \
rasqal(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libraptor2.so.0()(64bit) \
librasqal.so.3()(64bit) \
librasqal3"

inherit rpm
