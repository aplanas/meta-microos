SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python39-google_trans_new-1.1.9-2.1.noarch.rpm"
RPM_HASH = "0e958da857fe58bd65c3390688179a7d6af98a87d04e21f1da67490bec0ccd4bce8e03cb75b4a7b230d420786f1030bab2ac27d7158298f30d964f50df5d9435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-trans-new \
python39-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-urllib3"

inherit rpm
