SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-doc-3.12.0b1-1.1.aarch64.rpm"
RPM_HASH = "7a56b93e498c7b6ba100183999abadaf5912cba68b22e10d53929ad54a2ac48fbd713001cb5765cf73ab1ac0c63e34208dffd21739607bf7548aaedbaa370fa9"

RPROVIDES:${PN} += "python312-doc \
python312-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
