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

RPM_NAME = "python311-pybtex-0.24.0-2.4.noarch.rpm"
RPM_HASH = "831b4a9b4f1b5d921989303a706ed83543fc24ba79d3446bfdce9e36b315b5fb499af4e8f48b5efe85326c0e6dc103b8594cf51ad111e82212676a44510f1fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybtex \
python3.11dist-pybtex \
python311-pybtex \
python3dist-pybtex"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-latexcodec \
python311-pyparsing \
update-alternatives"

inherit rpm
