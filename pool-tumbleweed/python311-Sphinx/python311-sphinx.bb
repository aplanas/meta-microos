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

RPM_NAME = "python311-Sphinx-7.0.1-1.1.noarch.rpm"
RPM_HASH = "e3134a2eef8cbb7883f1fdcb6da5bd04f047898953748d86a930abdd4d11c221b2eedeebbb007412044c04c69a09d9f6b1937d47c3ce42c43649ad5a8ebc8eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx) \
python311-Sphinx \
python3dist(sphinx)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
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
python311-sphinx_rtd_theme \
python311-sphinxcontrib-applehelp \
python311-sphinxcontrib-devhelp \
python311-sphinxcontrib-htmlhelp \
python311-sphinxcontrib-jsmath \
python311-sphinxcontrib-qthelp \
python311-sphinxcontrib-serializinghtml \
python311-sphinxcontrib-websupport \
update-alternatives"

inherit rpm
