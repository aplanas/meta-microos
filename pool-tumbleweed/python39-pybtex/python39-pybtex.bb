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

RPM_NAME = "python39-pybtex-0.24.0-2.4.noarch.rpm"
RPM_HASH = "2510e0de6c150e4549bee3bc506b1f61a724486b3776c5e643080014a488f2cc93a00a9d44e077fbba75bfd2e38ba3394f922859e41ad9cc48ae9aa9075eafde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybtex \
python39-pybtex \
python3dist-pybtex"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-latexcodec \
python39-pyparsing \
update-alternatives"

inherit rpm
