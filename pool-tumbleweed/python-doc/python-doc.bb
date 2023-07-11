SUMMARY = "Additional Package Documentation for Python"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-doc-2.7.18-36.1.noarch.rpm"
RPM_HASH = "b1e8476b3a9e2f33d221a7ba2df24eaa9f90375a626354d09dbdb7b4dca7dd2a60ca54db8c8ca1156d8e8bb3cb7df6da84279d74df53c61328540ce93b24383d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyth-doc \
pyth-ps \
python-doc \
python2-doc"

RDEPENDS:${PN} += ""

inherit rpm
