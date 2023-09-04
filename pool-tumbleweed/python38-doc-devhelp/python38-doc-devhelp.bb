SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-doc-devhelp-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "6888641ed5596e00c4ac7c596aeb48210c7b1dc1b48271a8c0fd177a9a02564c1978e41166ee2d041807cc35b0fddc9c2874e2c46890bea0ca99bfad75fcd183"

RPROVIDES:${PN} += "python38-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
