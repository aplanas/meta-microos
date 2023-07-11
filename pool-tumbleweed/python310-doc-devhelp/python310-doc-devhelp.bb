SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-doc-devhelp-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "dd1096d2111c24077f2c0cc6a31f011c30adcb29d5b43e9ed767a27806b1108083112b65504135a652472e8e58206361d87e69e8e03f1bdf81542da0c67cb254"

RPROVIDES:${PN} += "python310-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
