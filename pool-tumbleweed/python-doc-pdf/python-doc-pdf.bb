SUMMARY = "Python PDF Documentation"
DESCRIPTION = "Tutorial, Global Module Index, Language Reference, Library Reference, \
Extending and Embedding Reference, Python/C API Reference, Documenting \
Python, and Macintosh Module Reference in PDF format."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-doc-pdf-2.7.18-36.1.noarch.rpm"
RPM_HASH = "91bb24e08da502c5012e588571ce9c3f71c44ef94280556738355f89ce776af7d51f467b0447f70e62f50ce8e2a6d9bf39dba3a89bb2acd19888fed83e57fe71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyth-pdf \
python-doc-pdf \
python2-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
