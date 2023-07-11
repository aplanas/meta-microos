SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.8"

RPM_NAME = "python310-nltk-3.8-2.3.noarch.rpm"
RPM_HASH = "bccaff73a70f5625eea1119b69a28b9c3d4e1bed82a9ceb576b7b37a71b389d21ccef53992f47ab5119b0b58eec4465fb9ad7a852bc1d2569c16e368204a3116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nltk \
python310-nltk \
python3dist-nltk"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-regex \
update-alternatives"

inherit rpm
