SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.8"

RPM_NAME = "python311-nltk-3.8-2.3.noarch.rpm"
RPM_HASH = "756d215772c6b904c6472d5106d3c0e742f107cc26711c666d946d42e0c8523b8427d26697e4b576f9b5b2c9e0ffe3c9fa13be4027b2d3cbca3f73ca6faf6da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nltk \
python3.11dist-nltk \
python311-nltk \
python3dist-nltk"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-regex \
update-alternatives"

inherit rpm
