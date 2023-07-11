SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python311-myst-parser-0.17.2-3.3.noarch.rpm"
RPM_HASH = "50bf25dc603565662114d9a0709cf5538ca90b61bc06286b6b940bdc4f7867c62ec5c964eca8c16492e7cf5d84b32cf4ae77095149c4200c1dafffedb51bd682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-myst-parser \
python3.11dist-myst-parser \
python311-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Jinja2 \
python311-PyYAML \
python311-Sphinx \
python311-docutils \
python311-markdown-it-py \
python311-mdit-py-plugins \
python311-typing-extensions \
update-alternatives"

inherit rpm
