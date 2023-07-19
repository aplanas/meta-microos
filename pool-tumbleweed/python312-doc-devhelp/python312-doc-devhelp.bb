SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-doc-devhelp-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "774f7427f6935014e9f19139bc374011be2f5a7c338166f25215863b765883e1cbcc81c1dc85a288255d88ee3fa12a417d76d44173b55a6628f6ca920c21d0b4"

RPROVIDES:${PN} += "python312-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
