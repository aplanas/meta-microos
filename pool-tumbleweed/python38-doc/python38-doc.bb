SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-doc-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "4b887b9c171c3bc75034f5e7380f46658f60a0d27bc1d00af91f49b436310e64fa854a250aa35d4cc526c8e5d6c132a4067c109657e5eff6d1ce13736df12707"

RPROVIDES:${PN} += "python38-doc"

RDEPENDS:${PN} += ""

inherit rpm
