SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-recommonmark-0.7.1-4.1.noarch.rpm"
RPM_HASH = "429ed2905a5ef9d2c6c185279e084098be517ce1edb00d8f6c5e52b0b73b0577595f764042675efacb34ecb93812c799e9df4b2689d4257608d198f64dfd4361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-recommonmark \
python310-reCommonMark \
python310-recommonmark \
python3dist-recommonmark"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-CommonMark \
python310-Sphinx \
python310-docutils \
update-alternatives"

inherit rpm
