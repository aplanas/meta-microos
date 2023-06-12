SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-doc-devhelp-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "f49dbb59a18acfa388512a1bb48d41758af150d41b0aa0adb37f77c46c9f68c0c34450fcc3f9972d6ba666beec38943727b6596bbb125b0e98b4a08a021063fe"

RPROVIDES:${PN} += "python38-doc-devhelp \
python38-doc-devhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
