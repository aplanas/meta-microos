SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-doc-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "d88ede67222d74743075f845e21303dc4bc868b8a3463a4d3a9be71bdc3d9547584e43b72bdaa97ce79795c08ccf8c319ff19e7238e755e349730dd97b555d74"

RPROVIDES:${PN} += "python38-doc"

RDEPENDS:${PN} += ""

inherit rpm
