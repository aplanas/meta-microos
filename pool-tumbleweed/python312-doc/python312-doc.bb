SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-doc-3.12.0b3-1.1.aarch64.rpm"
RPM_HASH = "007b02d13c2db741c0e9322cd26d82347e734c071bb8b8ba56714a8e18cc67860d528e90cca876d854fa9bbf570d0331984e3cc686ef2e2ddfde20bad72f98dc"

RPROVIDES:${PN} += "python312-doc"

RDEPENDS:${PN} += ""

inherit rpm
