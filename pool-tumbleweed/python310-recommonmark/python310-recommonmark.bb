SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-recommonmark-0.7.1-3.1.noarch.rpm"
RPM_HASH = "411d09fe2c30fc37b977e06e33e371f305abe08c5998972351a590eece5ac909eeb4da99c92cd128610ae7d923dc67325b01c1670bc02cb7bc8483da4ba3e699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reCommonMark \
python3-recommonmark \
python3.10dist-recommonmark \
python310-reCommonMark \
python310-recommonmark \
python3dist-recommonmark"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-CommonMark \
python310-Sphinx \
python310-docutils \
update-alternatives"

inherit rpm
