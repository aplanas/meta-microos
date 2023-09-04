SUMMARY = "Additional Package Documentation for Python"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-doc-2.7.18-37.1.noarch.rpm"
RPM_HASH = "1396b362eef0f94db6eded4f0339ee76d8b5772575bd4629265b85a6ec7db6cfc53fe437c51a025e582e9554f26233d239a769bd8a24c5e83ceefd41be661e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyth-doc \
pyth-ps \
python-doc \
python2-doc"

RDEPENDS:${PN} += ""

inherit rpm
