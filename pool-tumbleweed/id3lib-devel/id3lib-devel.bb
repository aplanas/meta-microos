SUMMARY = "Documentation and Headers for id3lib"
DESCRIPTION = "This package contains the headers and documentation for the id3lib API \
that programmers will need to develop applications which use id3lib, \
the software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-devel-3.8.3-268.10.aarch64.rpm"
RPM_HASH = "079067e3d1ca4d28e0eeffc6f9d2bcd7f929c0e7204542fb863d86123bbb3df71a47022a3b628b0780e8abe359287e539a49c2f64b35c714467b5d62e832874b"

RPROVIDES:${PN} += "id3lib-devel"

RDEPENDS:${PN} += "libid3-3-8-3 \
libstdc++-devel"

inherit rpm
