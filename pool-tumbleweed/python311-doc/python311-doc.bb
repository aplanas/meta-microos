SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-doc-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "ed5f5989b7f4f4bce09266e858cf6a780cc519257833acee97d0d47514d764ec1ad8b0f87f0c5a68e83de51c34e93ec7f0c17bcbf120e835e9cc432a921c8389"

RPROVIDES:${PN} += "python311-doc"

RDEPENDS:${PN} += ""

inherit rpm
