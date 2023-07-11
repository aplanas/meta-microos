SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-doc-devhelp-3.11.4-1.1.aarch64.rpm"
RPM_HASH = "bdde2a158c7cd50212bcb35c6ce017fd094d057d1bdc38fb3d7b870e35a056d6bce4e5603c8e5ab6040b98760afa2e2ccbd187c21ff3e162c4bb1c1bdaf7963a"

RPROVIDES:${PN} += "python3-doc-devhelp \
python311-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
