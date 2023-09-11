SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-doc-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "70ce8dd858cc6bb569cf93b534afda3ff505dbf438ccb065355a06712a99b02f7dc4e06e11ffa17a8b09c7a4b4ac82c37cb9e8af9ce45098c05bb301ce1e3c92"

RPROVIDES:${PN} += "python310-doc"

RDEPENDS:${PN} += ""

inherit rpm
