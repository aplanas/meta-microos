SUMMARY = "An extended commonmark compliant parser, with bridges to docutils & sphinx"
DESCRIPTION = "MyST is a flavor of markdown that is designed for simplicity, flexibility, and extensibility. \
This is the reference implementation of MyST Markdown, as well as a collection of tools to support working with MyST in Python and Sphinx. \
It contains an extended CommonMark (https://commonmark.org)-compliant parser using markdown-it-py (https://markdown-it-py.readthedocs.io/), as well as a Sphinx (https://www.sphinx-doc.org) extension that allows to write MyST Markdown in Sphinx."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python39-myst-parser-0.17.2-2.10.noarch.rpm"
RPM_HASH = "8e0ca478d759d36b096b0dfb63ffa3a01a4860035e029d47e5ee00ce84c8cc9142681009d5896580ee0d96bf7e04fb0243c6efb8821b1950962bc07d02832c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-myst-parser \
python39-myst-parser \
python3dist-myst-parser"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
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
