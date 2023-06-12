SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-recommonmark-0.7.1-3.1.noarch.rpm"
RPM_HASH = "800b6a9445d65d37bed1f784b2f5da375aaa15bf716b0bab020001b7ef060332a6e7a557e12a6d675bf3814e40f6d6e9d062867fc8a60b28d62a8568a170688e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(recommonmark) \
python311-reCommonMark \
python311-recommonmark \
python3dist(recommonmark)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-CommonMark \
python311-Sphinx \
python311-docutils \
update-alternatives"

inherit rpm
