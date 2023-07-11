SUMMARY = "Documentation package for librasqal-devel"
DESCRIPTION = "This package contains the documentation and help files to aid with \
developing software using the Rasqal RDF query language library."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "librasqal-devel-doc-0.9.33-1.31.aarch64.rpm"
RPM_HASH = "77c1c3f50ccc73c849dcf5f8417012916409f8f67da60120687ab1c7eb3e33bb5e269754c3192dc6c3c36677a0f4f10338ebfec30de90c0f3ea2f4349477f5a6"

RPROVIDES:${PN} += "librasqal-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
