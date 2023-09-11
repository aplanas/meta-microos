SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-doc-devhelp-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "e670dc368a08b0449a7285fcd62fb364427bdce99cba97a8b6106cd98c334713d72d1b03aee01f6ad0585e989759cd017926bab3d6daf2ab5e65bc77cb173a39"

RPROVIDES:${PN} += "python310-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
