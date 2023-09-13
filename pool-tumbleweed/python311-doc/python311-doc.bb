SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-doc-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "d3f7cc875e856b75882aa2e5aa3cedc6dc8fbc26ed415f25c3c72cd1f637356a150e95bdfea3e97c53466c4cc8b5d58ae7fce43557d144fbe4f8033e0409716a"

RPROVIDES:${PN} += "python3-doc \
python311-doc"

RDEPENDS:${PN} += ""

inherit rpm
