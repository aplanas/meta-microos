SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-doc-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "640d2f0c2f6886fc90707a9c4eb22ef13303bfb9d04e6dea811148e5831c670ecbe3ba480f7b4dda5a47e895380ea4ff2c92d1ad9940ebed61cf42a1693397c2"

RPROVIDES:${PN} += "python39-doc"

RDEPENDS:${PN} += ""

inherit rpm
