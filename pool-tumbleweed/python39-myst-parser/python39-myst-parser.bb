SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python39-myst-parser-0.17.2-3.3.noarch.rpm"
RPM_HASH = "098f8f6a65165726392e0b079123e27c7b5aa24be71c4e4cfafbf226831cad0cc76ceffa518ba2feabaf9d603f3f8fe1a25818c1a41684f2bf73d30db4553dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-myst-parser \
python39-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-PyYAML \
python39-Sphinx \
python39-docutils \
python39-markdown-it-py \
python39-mdit-py-plugins \
python39-typing-extensions \
update-alternatives"

inherit rpm
