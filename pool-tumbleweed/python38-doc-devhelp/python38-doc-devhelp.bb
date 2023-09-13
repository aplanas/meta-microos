SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-doc-devhelp-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "e11cefbdf4437815c6447e154927f0e7c0375d7002d03d92e767e10281551b3ad8d251d8768f0fcaa2d938f8a0427b210507a6bed6bba2702e1e458ce036e3ce"

RPROVIDES:${PN} += "python38-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
