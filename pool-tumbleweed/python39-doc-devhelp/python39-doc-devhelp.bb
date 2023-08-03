SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-doc-devhelp-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "8cf20df19ff53036c812312f939f86e5b343c5744704d5569af3e295d0fbb7f7f0b75d696d0608acf331a93fe458467428a0b9e2cfa65bba5d38bb7e66784d28"

RPROVIDES:${PN} += "python39-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
