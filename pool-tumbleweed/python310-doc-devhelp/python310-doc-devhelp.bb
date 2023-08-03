SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-doc-devhelp-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "9cd89effcc540a376c57ecbdb0410c50f6e18bc89cd182dea7d88033e58cd8a121e42f46b77acae8cf57ecfcccc65c397c74943612565926741dc7aeb4b130bd"

RPROVIDES:${PN} += "python310-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
