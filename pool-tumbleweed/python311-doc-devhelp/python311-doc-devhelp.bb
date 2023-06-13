SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-doc-devhelp-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "93d7805a9e0fde45a709aff619ce808466cd6e0e242216403a2f6d1b765045d26e5f5487703565aa12cef078994ea6cb4d369b0002e4f6fe98c7f4bb72e99af9"

RPROVIDES:${PN} += "python311-doc-devhelp \
python311-doc-devhelp(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
