SUMMARY = "Development package for programs that use Redland"
DESCRIPTION = "Files needed to develop with the Redland RDF library."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "libredland-devel-1.0.17-2.20.aarch64.rpm"
RPM_HASH = "a8dc677edf70f3ad68040262f612cad414a8a1423fa7ec1a4a715cf00ec59b44ff7de7f4398a477e774cf3e2fc944cf161d5dc291bfad69aaef5edcf10c94b1c"

RPROVIDES:${PN} += "libredland-devel \
libredland-devel(aarch-64) \
pkgconfig(redland)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
librdf0 \
pkgconfig(raptor2) \
pkgconfig(rasqal)"

inherit rpm
