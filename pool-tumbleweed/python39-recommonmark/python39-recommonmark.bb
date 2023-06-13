SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-recommonmark-0.7.1-3.1.noarch.rpm"
RPM_HASH = "6ddf7e6fcbd539c8417a22732e02a94f96ad006bd8db3cb0b852fe298f080a45f9cbff66f1a88fad3070559a284c1d67650052e1dc7d5a42b6ff03b54b45d680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(recommonmark) \
python39-reCommonMark \
python39-recommonmark \
python3dist(recommonmark)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-CommonMark \
python39-Sphinx \
python39-docutils \
update-alternatives"

inherit rpm
