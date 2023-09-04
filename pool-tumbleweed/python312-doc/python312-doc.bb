SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-doc-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "d6a277cbaa1c7d32ee69d8445c8568eea22969eda6050d146d153844687c6cb1620f93157903e7234af8ddf58974d4094ff2773b16a781ef131ff65db41d2415"

RPROVIDES:${PN} += "python312-doc"

RDEPENDS:${PN} += ""

inherit rpm
