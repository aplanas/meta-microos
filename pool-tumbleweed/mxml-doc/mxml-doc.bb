SUMMARY = "Documentation for mxml"
DESCRIPTION = "Mini-XML is a small XML parsing library that you can use to read XML \
and XML-like data files in your application without requiring large \
nonstandard libraries. \
 \
This package holds the HTML documentation for mxml."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "mxml-doc-3.3.1-1.3.noarch.rpm"
RPM_HASH = "8f6ac0417e7bce4aa0d48088becce283234aec13be5ad32577f50f8a13ede99a33a275f92e413b1a5a1b29c2a04438657b152ff69d89e39638d99daa7e3e023b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
