SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-doc-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "503227fa378b63e38ea095b6648f257a5e286bcf587da30b699fa74266d7062c77a8a4dd59500d9a49693ff0b4f3715c8152b1547b7e8847829b4bc69a495eeb"

RPROVIDES:${PN} += "python310-doc"

RDEPENDS:${PN} += ""

inherit rpm
