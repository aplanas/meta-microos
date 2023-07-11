SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-doc-devhelp-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "a5a18608bda635986ab6b487a77a59518279c0fe7341cf63b4ca200173181e7f3af0d43abc7c14f19f30629c6badb0d624046821e75cde9532ca4953f13cbb6f"

RPROVIDES:${PN} += "python39-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
