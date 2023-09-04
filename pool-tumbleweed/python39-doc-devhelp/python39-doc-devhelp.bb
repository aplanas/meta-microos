SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-doc-devhelp-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "63cb21c1e5905e5436a3a19d07cd989f95bc6f7de8373aab66ba2ee10542188b46da386e3f50d97b7e9a72ae7d5a9b9d5a8ee1f51e79dfc20720f07d993696ef"

RPROVIDES:${PN} += "python39-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
