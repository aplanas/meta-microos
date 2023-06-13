SUMMARY = "BibTeX-compatible Bibliography Processor in Python"
DESCRIPTION = "Pybtex is a BibTeX-compatible bibliography processor written in Python which \
can produce formatted bibliographies in different, customizable formats. It \
supports both native BibTeX style files and styles written in Python and \
accepts BibTeX, BibTeXML, and a custom YAML-based bibligraphy input format and \
can output LaTeX, HTML, and plain text. \
 \
Furthermore, Pybtex provides an interface for Python applications which need to \
process the above formats."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python310-pybtex-0.24.0-2.2.noarch.rpm"
RPM_HASH = "6f212ffed554002159ef1175941a80620cea4d7a5b360240379813d1e91d819c934967e7c216525f44e8e2e38cbbf89626a7f5c9a1ccdf5a7065de950b4896d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybtex \
python3.10dist(pybtex) \
python310-pybtex \
python3dist(pybtex)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-latexcodec \
python310-pyparsing \
update-alternatives"

inherit rpm
