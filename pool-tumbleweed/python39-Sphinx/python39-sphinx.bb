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

PV = "7.0.1"

RPM_NAME = "python39-Sphinx-7.0.1-1.1.noarch.rpm"
RPM_HASH = "2d67d6212e71406ef318c9d3e14b8aa056bd355f0b8ccc0d4ad18a888381239fac2936a377d435daacc7101b57347f91a049aa096e0b5911f06ce5f8cfb03cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx) \
python39-Sphinx \
python3dist(sphinx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
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
python39-sphinx_rtd_theme \
python39-sphinxcontrib-applehelp \
python39-sphinxcontrib-devhelp \
python39-sphinxcontrib-htmlhelp \
python39-sphinxcontrib-jsmath \
python39-sphinxcontrib-qthelp \
python39-sphinxcontrib-serializinghtml \
python39-sphinxcontrib-websupport \
update-alternatives"

inherit rpm
