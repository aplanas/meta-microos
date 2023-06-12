SUMMARY = "Documentation package for librasqal-devel"
DESCRIPTION = "This package contains the documentation and help files to aid with \
developing software using the Rasqal RDF query language library."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "librasqal-devel-doc-0.9.33-1.30.aarch64.rpm"
RPM_HASH = "6195b75a7f59379d7990317377b89f5a8d6d565cccf38f428f1e09d9a287157c411254ebcb5217d30789d3c2305c1248958d835ed55f25837615829d9ae18d5b"

RPROVIDES:${PN} += "librasqal-devel-doc \
librasqal-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
