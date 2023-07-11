SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-recommonmark-0.7.1-3.3.noarch.rpm"
RPM_HASH = "29a24400ac3bcc2b0716b65c55fa1feb7fa6e7a3b984ed5c4426febe24bb10b30e445669095bdd7505dcf5b28a69bce7d0e839ccb2c3b694b4629974baa38b59"
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
