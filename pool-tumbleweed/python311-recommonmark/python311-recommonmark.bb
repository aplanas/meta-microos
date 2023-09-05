SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-recommonmark-0.7.1-4.1.noarch.rpm"
RPM_HASH = "3fadb5aa6eabb2e1c09e20285cd079922078d4f0ca4d71373aa0e00bcd0b9039e5d0b87a909472171b396496ddaac2e06a3fe7857df0457248aa3ccec7e2b8b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reCommonMark \
python3-recommonmark \
python3.11dist-recommonmark \
python311-reCommonMark \
python311-recommonmark \
python3dist-recommonmark"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-CommonMark \
python311-Sphinx \
python311-docutils \
update-alternatives"

inherit rpm
