SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-doc-devhelp-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "76e078f2a9ba7c6f4fd4e90a65b0c4f5f7b557f0e90d971fde9dbc728bde9902d29cef3ff11c08b3273e7734a57015193acdc156bbeccf5959235044ce3cf9c7"

RPROVIDES:${PN} += "python312-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
