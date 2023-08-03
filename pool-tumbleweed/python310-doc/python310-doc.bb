SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-doc-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "575ac0c02a326dd43d636525003bbfc828ad8c6cabe035863ab59f899471f8cb0667ad4bc4d0e6ee1f33c7fdcd7b19b1ef076b02ac8d1a2a71f8e06cc32b4eb3"

RPROVIDES:${PN} += "python310-doc"

RDEPENDS:${PN} += ""

inherit rpm
