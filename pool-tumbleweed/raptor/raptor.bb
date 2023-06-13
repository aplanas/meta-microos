SUMMARY = "RDF Parser Toolkit"
DESCRIPTION = "Raptor is the RDF Parser Toolkit for Redland that provides a set of \
standalone RDF parsers, generating triples from RDF/XML or N-Triples."
LICENSE = "LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0"

PV = "2.0.15"

RPM_NAME = "raptor-2.0.15-3.18.aarch64.rpm"
RPM_HASH = "b612a7cc54f3c74da75fe91ebbfdb5c7eb9e6251ff687e3c28c12f18de048628e9a0b457366c6a8c0de872ea69b862946bd5d3349367f9e7ddabaf56a1786209"

RPROVIDES:${PN} += "raptor \
raptor(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libraptor2.so.0()(64bit)"

inherit rpm
