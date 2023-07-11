SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-doc-devhelp-3.8.17-1.1.aarch64.rpm"
RPM_HASH = "cdaa936eeb08cb98bf8b377046f92934527ec361e5c0afa506c4d51e70ca13aff17cc346e72dc81cc06438f75a0ada1934d782798accdb7d9f3fc25d55e27cab"

RPROVIDES:${PN} += "python38-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
