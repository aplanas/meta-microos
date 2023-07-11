SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-doc-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "bd279fa4d0b7224e0003a6fc33d7e6ca6dbb15898dc5a9b3e00a8d7f4bce5b9b2d8022a195eddce7859b11c9dfbb6d3384a067cb87fe3779a0b4929aceea1e20"

RPROVIDES:${PN} += "python39-doc"

RDEPENDS:${PN} += ""

inherit rpm
