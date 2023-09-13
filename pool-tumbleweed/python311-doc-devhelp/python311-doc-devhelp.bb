SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-doc-devhelp-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "4177e58e9af5501e42826645f783a868cd657a2aac990877133ab3cef2d7bc3660036d583dac5acd4a94b1762fde9a92c24c1e824a04b4f1beaefa1a6a0862da"

RPROVIDES:${PN} += "python3-doc-devhelp \
python311-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
