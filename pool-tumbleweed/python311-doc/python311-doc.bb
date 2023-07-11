SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-doc-3.11.4-1.1.aarch64.rpm"
RPM_HASH = "38ace694250c4f31bc6b92549699d3fcd105088a2f19762129d56eb9ecc6692259317a7d420f17e3ddee7d4a6110da3bbd80cb2b7cd117df78a2ef27c2d12841"

RPROVIDES:${PN} += "python3-doc \
python311-doc"

RDEPENDS:${PN} += ""

inherit rpm
