SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-doc-3.8.17-1.1.aarch64.rpm"
RPM_HASH = "eb5b68d561726cb608c4772fb4e3297f6a8d206fdf9152a8c82f0af556de8c64137922fdf379e260d677c8655a174d0fa61446ab51645e378b538ce779067c71"

RPROVIDES:${PN} += "python38-doc"

RDEPENDS:${PN} += ""

inherit rpm
