SUMMARY = "Natural Language Toolkit"
DESCRIPTION = "NLTK -- the Natural Language Toolkit -- is a suite of \
Python modules, data sets and tutorials supporting research and \
development in Natural Language Processing."
LICENSE = "Apache-2.0"

PV = "3.8"

RPM_NAME = "python39-nltk-3.8-2.1.noarch.rpm"
RPM_HASH = "4b46b844200c8675452393c82dd3bdce32989791093a259a5ccfb3700a9f918d15cfd3f7b1779decaed16142a3a9b4d000df19977fc239303fd3246bb79fb662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nltk) \
python39-nltk \
python3dist(nltk)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-regex \
update-alternatives"

inherit rpm
