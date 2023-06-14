SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python310-myst-parser-0.17.2-2.10.noarch.rpm"
RPM_HASH = "953cbe9a40b82c5af9557c531bf8fe9e1650da29b869c68f4561cdfe7d66b2f1262962f85d245b3f49f83916341794948d494c710467452bc343cfb6639ec586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-myst-parser \
python3.10dist-myst-parser \
python310-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Jinja2 \
python310-PyYAML \
python310-Sphinx \
python310-docutils \
python310-markdown-it-py \
python310-mdit-py-plugins \
python310-typing-extensions \
update-alternatives"

inherit rpm
