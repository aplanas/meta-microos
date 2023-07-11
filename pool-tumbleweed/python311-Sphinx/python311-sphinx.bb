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

RPM_NAME = "python311-Sphinx-7.0.1-1.2.noarch.rpm"
RPM_HASH = "baed7eabe66f6b0729bb3b61543336342b01985648de97989cc43461b118a73bd52dcde3c69e22a808f55f61c80150590ef12f6896b664fcf9b15df591af763f"
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
