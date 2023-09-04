SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python310-lxml-devel-4.9.3-1.1.aarch64.rpm"
RPM_HASH = "7ff6ddb9629748fe54822ed663e80704a4ae32631d7d0655b4fe88f4719ba1741f443a021b3694e3f1f614156d88d4d10780a04db79a7e0ca40fdba3fb1862bd"

RPROVIDES:${PN} += "python310-lxml-devel"

RDEPENDS:${PN} += "python310-lxml"

inherit rpm
