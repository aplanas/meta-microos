SUMMARY = "Documentation for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides the documentation for MathGL in HTML format."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-doc-8.0.1-4.2.noarch.rpm"
RPM_HASH = "d516063682cc60c94c671c617fcd1e7b05530546fb9e0bdfa8915818ce724d4d03a4161df5e1f8a8b860fd8c5014a8319f5a6c116a17519fd1ede2f3492e4d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-doc"

RDEPENDS:${PN} += ""

inherit rpm
