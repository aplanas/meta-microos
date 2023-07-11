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

RPM_NAME = "python310-pybtex-0.24.0-2.4.noarch.rpm"
RPM_HASH = "6bcb05a6a36b33ab59809e9cd12d794eba4d24d48f0f8f25c9952b53622248460f733d96b5f82ec0a01daee44c3ea9f1cffcdefeea0d0c294a8357eaa47e154f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybtex \
python310-pybtex \
python3dist-pybtex"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-latexcodec \
python310-pyparsing \
update-alternatives"

inherit rpm
