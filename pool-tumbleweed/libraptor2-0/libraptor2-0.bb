SUMMARY = "RDF Parser Toolkit"
DESCRIPTION = "Raptor is the RDF Parser Toolkit for Redland that provides a set of \
standalone RDF parsers, generating triples from RDF/XML or N-Triples."
LICENSE = "LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0"

PV = "2.0.15"

RPM_NAME = "libraptor2-0-2.0.15-3.18.aarch64.rpm"
RPM_HASH = "43832bfd12761a29f0a0d9d6ac22a041da1704ac949fae46a189aba9df138cbb34438e0bc098759dff2a9260e1a584cb5e3e781171bbe8dc9ad93de02560a36e"

RPROVIDES:${PN} += "libraptor2-0 \
libraptor2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libicuuc.so.73 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
