SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-recommonmark-0.7.1-4.1.noarch.rpm"
RPM_HASH = "a6ab5b8c3858393febf4685019e586f3e7ab2a736b319a4b98c2c9e21c2e1ef2af142969e71627cbf0e262552f6e64ad2c6102002c7d70e647c6fbcaf5353e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-recommonmark \
python39-reCommonMark \
python39-recommonmark \
python3dist-recommonmark"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-CommonMark \
python39-Sphinx \
python39-docutils \
update-alternatives"

inherit rpm
