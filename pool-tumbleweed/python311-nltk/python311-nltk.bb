SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.8"

RPM_NAME = "python311-nltk-3.8-2.1.noarch.rpm"
RPM_HASH = "366f22f5bfe7abdc62e59cbdc738644267e75bab78805596631c4a0a48dcf8b138045d7a8b00049bcaf0302d33f2ffdfaa1daa5082ad8530413c1537a50f230f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nltk \
python311-nltk \
python3dist-nltk"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-regex \
update-alternatives"

inherit rpm
