SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-doc-devhelp-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "67b3ce02340a71bbc35a917d4ff5e7817d95379119250f6787725dadc7642c2e53b7bc135e16b1affdd127a0d0220df5eca1452d72f460ec16beca33b31e840d"

RPROVIDES:${PN} += "python3-doc-devhelp \
python311-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
