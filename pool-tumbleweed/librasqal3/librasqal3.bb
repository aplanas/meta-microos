SUMMARY = "RDF Parser Toolkit for Redland"
DESCRIPTION = "Rasqal is a library providing full support for querying Resource \
Description Framework (RDF) including parsing query syntaxes, \
constructing the queries, executing them and returning result formats. \
It currently handles the RDF Data Query Language (RDQL) and SPARQL \
Query language."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "librasqal3-0.9.33-1.31.aarch64.rpm"
RPM_HASH = "e2d70937ec127f434ac3cc3f92283c3c590ce9a4f83d7040ea4d534b59fa146e2b63caf680321de08fbfebca8ab4f8b2f66c447055dae7b734cc011e7b73ab98"

RPROVIDES:${PN} += "librasqal.so.3 \
librasqal3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpfr.so.6 \
libpcre.so.1 \
libraptor2.so.0"

inherit rpm
