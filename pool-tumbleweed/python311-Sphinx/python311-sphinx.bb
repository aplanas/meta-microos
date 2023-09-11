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

PV = "7.2.4"

RPM_NAME = "python311-Sphinx-7.2.4-1.1.noarch.rpm"
RPM_HASH = "d0d5b3e7434a98575e9d12dd9bba89263d12dbe67c64c709042ae81cf80c618e6b21b73168afa0c2ad46c62d2e7648a2427fc785b48cd95f9f46c05ad9bc721b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Sphinx \
python3.11dist-sphinx \
python311-Sphinx \
python3dist-sphinx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Babel \
python311-Jinja2 \
python311-Pygments \
python311-alabaster \
python311-docutils \
python311-imagesize \
python311-packaging \
python311-requests \
python311-setuptools \
python311-snowballstemmer \
python311-sphinx-rtd-theme \
python311-sphinxcontrib-applehelp \
python311-sphinxcontrib-devhelp \
python311-sphinxcontrib-htmlhelp \
python311-sphinxcontrib-jsmath \
python311-sphinxcontrib-qthelp \
python311-sphinxcontrib-serializinghtml \
python311-sphinxcontrib-websupport \
update-alternatives"

inherit rpm
