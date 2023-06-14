SUMMARY = "Python PDF Documentation"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in PDF format."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-doc-pdf-2.7.18-34.1.noarch.rpm"
RPM_HASH = "332f33b56a4b4c0d5f6bc1a44af05ad5a3502f51b908595ff7988fd8353d53f5165b7210fd06401a8d2146933c99447292f18d1e768d626cac3a1da71799abaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyth-pdf \
python-doc-pdf \
python2-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
