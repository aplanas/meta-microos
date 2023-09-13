SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-doc-devhelp-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "92e202dbd0870a4c736b3953a38be20decd13544e8896392509bb66ce6270d696d4caa10dc8dd01a000053b51a470fb2b69e073787da3da4e51995c78fe04a8b"

RPROVIDES:${PN} += "python39-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
