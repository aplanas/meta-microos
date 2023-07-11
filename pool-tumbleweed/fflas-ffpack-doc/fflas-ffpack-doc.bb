SUMMARY = "API documentation for FFLAS-FFPACK"
DESCRIPTION = "The FFLAS-FFPACK library provides functionalities for dense linear \
algebra over word size prime finite field. \
 \
This subpackage contains the Doxygen-generated HTML documentation for \
the FFLAS-FFPACK API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "fflas-ffpack-doc-2.5.0-1.6.noarch.rpm"
RPM_HASH = "446d0280f470d7d3b73d50a21d03f92c8a10f6afc222fd281032d5e6121097ae7fa4cde769e591b9dc0cc9843672417cd6105a824bdfc3a74e1574f3d41e25e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fflas-ffpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
