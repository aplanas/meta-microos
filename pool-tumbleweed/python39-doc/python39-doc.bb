SUMMARY = "Package Documentation for Python 3"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in HTML format."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-doc-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "33deeb2b1985f7365765b8cab1d2cba5cd65d1b4c20eaef76a5c6598c1113aeb0b75f1867b26ac94277fcfbf8b968f8609607a0ab5ff6c84bc31f9921573cad8"

RPROVIDES:${PN} += "python39-doc \
python39-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
