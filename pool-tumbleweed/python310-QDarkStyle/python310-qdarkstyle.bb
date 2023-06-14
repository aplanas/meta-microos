SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-QDarkStyle-3.0.2-1.11.noarch.rpm"
RPM_HASH = "44321ed9e839a5f0bc02ef943cf2292e804a9d447f6667d0bca2e3995c1fe87968774215f5d9e5c114877a43a61e89c8c838413acefbe60c8a7c8b9e490929c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QDarkStyle \
python3.10dist-qdarkstyle \
python310-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-QtPy \
python310-setuptools"

inherit rpm
