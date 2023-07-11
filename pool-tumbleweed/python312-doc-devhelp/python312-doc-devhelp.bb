SUMMARY = "Additional Package Documentation for Python 3 in devhelp format"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in format for devhelp."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-doc-devhelp-3.12.0b3-1.1.aarch64.rpm"
RPM_HASH = "ebdd0e319241214924e1b97e7d1f5e134741b762583a08e90ebaf62d79540cad0536f4e099798321baf4765ddac67bd83f09b3e38796f7f354f7092ccb8791e3"

RPROVIDES:${PN} += "python312-doc-devhelp"

RDEPENDS:${PN} += ""

inherit rpm
