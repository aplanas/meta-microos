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

RPM_NAME = "python310-Sphinx-7.0.1-1.2.noarch.rpm"
RPM_HASH = "22876bce3865b3918a3bb71805bfd608d4fc620ebaca72a524f2c38dc1e55f888aa632bcc374fdbe48baacf2b71d1d3c257d1bd5fee35b66712b7e1bdac30c16"
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
