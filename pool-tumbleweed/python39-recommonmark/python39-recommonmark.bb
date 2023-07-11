SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-recommonmark-0.7.1-3.3.noarch.rpm"
RPM_HASH = "efd9127dbe908c297f93456301344d25ca1ad5f8cde60104776ee0f6272be10bc9f55eb2f1812947502f0bf148aeffc59319c6473c0dce4035b29d0bc278c070"
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
