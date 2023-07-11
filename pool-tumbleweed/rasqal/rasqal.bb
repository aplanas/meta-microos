SUMMARY = "RDF Parser Toolkit for Redland"
DESCRIPTION = "Rasqal is a library providing full support for querying Resource \
Description Framework (RDF) including parsing query syntaxes, \
constructing the queries, executing them and returning result formats. \
It currently handles the RDF Data Query Language (RDQL) and SPARQL \
Query language."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "rasqal-0.9.33-1.31.aarch64.rpm"
RPM_HASH = "c228cebb14630bfa2ed82b0133d9174e305c3f28b3126fcd4ffefb8280598b8dd8da73f1fdd398007925d0e8caa671e5317da6585da66bd9c4bd9e7ebfbb9d39"

RPROVIDES:${PN} += "rasqal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0 \
librasqal.so.3 \
librasqal3"

inherit rpm
