SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-doc-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "8cd17349d6e0a89a85106d17dfcd69f7d01f02e8e3ba63b82557da33deb545fe08ce4281845a0b7b8bb85727514011972149522e7b881e464c3bd7d0d98972d7"

RPROVIDES:${PN} += "python39-doc"

RDEPENDS:${PN} += ""

inherit rpm
