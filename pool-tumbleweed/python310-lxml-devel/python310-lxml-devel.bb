SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python310-lxml-devel-4.9.2-7.3.aarch64.rpm"
RPM_HASH = "991dd28e15322ae7b3bc5e16e9ac803222b272a86210ae0b405b3d30023e9331ffcd962312940c3c8189bf2850f83cf6cefb407c366986d255b85a1c2a384930"

RPROVIDES:${PN} += "python310-lxml-devel"

RDEPENDS:${PN} += "python310-lxml"

inherit rpm
