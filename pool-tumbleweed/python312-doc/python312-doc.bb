SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-doc-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "29c15a0c2cb12df47c6a050c773b17f978a95c4f4d147b95f66ea9228f81cb70da558bc003df1b6e3c3f5f20e75e36b6489197ea3d8aed9105160c5f9489c17c"

RPROVIDES:${PN} += "python312-doc"

RDEPENDS:${PN} += ""

inherit rpm
