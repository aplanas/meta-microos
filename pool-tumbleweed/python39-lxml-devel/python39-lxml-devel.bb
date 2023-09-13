SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python39-lxml-devel-4.9.3-2.1.aarch64.rpm"
RPM_HASH = "6a9fb578ac49379bf4456ff648dd6074aa08b5d356866b6f2b6293a07c697f997edbd23e3390c7d2f984d09551c4e15696b02e3cf91071ad58a795eac1c23865"

RPROVIDES:${PN} += "python39-lxml-devel"

RDEPENDS:${PN} += "python39-lxml"

inherit rpm
