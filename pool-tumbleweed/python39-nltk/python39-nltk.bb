SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.8"

RPM_NAME = "python39-nltk-3.8-2.3.noarch.rpm"
RPM_HASH = "020416956a5e5e7b7351d429c8c616bef46c5af67cb6da7e6bf65b084a5cc4247c5e5088b45b6eaf0bffe6a020916bad4ad851024835524d95266ed058542975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nltk \
python39-nltk \
python3dist-nltk"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-regex \
update-alternatives"

inherit rpm
