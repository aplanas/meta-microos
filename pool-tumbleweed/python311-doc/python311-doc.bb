SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-doc-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "78770bcdc4ba9b4a804b0984d63a249e510b1a32c6f918cfddb626c5588fc1367d8caddc621adca81627d5d80a47646ac011127bc1aeb980335a1a530097e969"

RPROVIDES:${PN} += "python3-doc \
python311-doc"

RDEPENDS:${PN} += ""

inherit rpm
