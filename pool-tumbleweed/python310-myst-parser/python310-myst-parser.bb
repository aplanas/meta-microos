SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python310-myst-parser-0.17.2-3.3.noarch.rpm"
RPM_HASH = "69de9ee0887d971b241db5bedd818b8405d65c7cc271c71465f4b461aca266dce2546e49d323f45fd2a0212bcc2f02b98cf2e570bc50cede3b076f4315b51d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-myst-parser \
python310-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
