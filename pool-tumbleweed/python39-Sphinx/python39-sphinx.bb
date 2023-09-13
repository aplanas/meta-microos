SUMMARY = "Python documentation generator"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). It was originally created for the Python documentation, and \
supports Python project documentation well, but C/C++ is likewise \
supported. \
 \
Sphinx uses reStructuredText as its markup language. Sphinx draws from \
the parsing and translating suite, the Docutils."
LICENSE = "BSD-2-Clause"

PV = "7.2.5"

RPM_NAME = "python39-Sphinx-7.2.5-1.1.noarch.rpm"
RPM_HASH = "022fbc41b32beb2ec4a58c2b624bdca3c6a4a0c167c5f587d59684ac23b12fae803781c9eebc2c35ddbc923d4b0fab610b5f88fc52ff7ee8fa5a375cd8bac310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx \
python39-Sphinx \
python3dist-sphinx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Babel \
python39-Jinja2 \
python39-Pygments \
python39-alabaster \
python39-docutils \
python39-imagesize \
python39-importlib-metadata \
python39-packaging \
python39-requests \
python39-setuptools \
python39-snowballstemmer \
python39-sphinx-rtd-theme \
python39-sphinxcontrib-applehelp \
python39-sphinxcontrib-devhelp \
python39-sphinxcontrib-htmlhelp \
python39-sphinxcontrib-jsmath \
python39-sphinxcontrib-qthelp \
python39-sphinxcontrib-serializinghtml \
python39-sphinxcontrib-websupport \
update-alternatives"

inherit rpm
