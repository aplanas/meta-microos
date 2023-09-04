SUMMARY = "Python PDF Documentation"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in PDF format."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-doc-pdf-2.7.18-37.1.noarch.rpm"
RPM_HASH = "512db162aeca01ba0eea1b31508a3ab209da7c97f69e9f231681cb5a84c072164779c4783ae3cae1898110a9ce23fd71552e111e6e51f2cb361695ae48e266b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyth-pdf \
python-doc-pdf \
python2-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
