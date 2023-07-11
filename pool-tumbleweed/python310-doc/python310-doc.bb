SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-doc-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "e0725086e96194832bd0d1fd004bc122ce95526c7f618ef7918e4c5dcc2c13b307a41827de834a1e7ea0c41621686f90426bf346dde11e4cbb9193375c7d60f2"

RPROVIDES:${PN} += "python310-doc"

RDEPENDS:${PN} += ""

inherit rpm
