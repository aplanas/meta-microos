SUMMARY = "Development package for the Rasqal RDF query library"
DESCRIPTION = "This package contains the files needed to develop with the Rasqal RDF \
query language library."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "librasqal-devel-0.9.33-1.31.aarch64.rpm"
RPM_HASH = "7360062b11a4dc05289acc9dca294d27796f30bff6b0801aaeda37f67167e6b232a5f8c9bc7adbc10a4732bc619940e5a80b8cc4ff575eddabd40686322a4305"

RPROVIDES:${PN} += "librasqal-devel \
pkgconfig-rasqal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libraptor-devel \
librasqal3 \
pkgconfig-raptor2"

inherit rpm
