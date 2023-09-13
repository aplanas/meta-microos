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

RPM_NAME = "python310-Sphinx-7.2.5-1.1.noarch.rpm"
RPM_HASH = "0e0d6baf0ef66fd5bf4393ac44a90c768e18f2dbd8b7cc45c771fde6aa9a832c336a8b053608f2adecefaba130bbbb1f32d05ddcfbd15d1fc6d6a8cac00eed16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx \
python310-Sphinx \
python3dist-sphinx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Babel \
python310-Jinja2 \
python310-Pygments \
python310-alabaster \
python310-docutils \
python310-imagesize \
python310-packaging \
python310-requests \
python310-setuptools \
python310-snowballstemmer \
python310-sphinx-rtd-theme \
python310-sphinxcontrib-applehelp \
python310-sphinxcontrib-devhelp \
python310-sphinxcontrib-htmlhelp \
python310-sphinxcontrib-jsmath \
python310-sphinxcontrib-qthelp \
python310-sphinxcontrib-serializinghtml \
python310-sphinxcontrib-websupport \
update-alternatives"

inherit rpm
