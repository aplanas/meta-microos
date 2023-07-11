SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python310-google_trans_new-1.1.9-1.3.noarch.rpm"
RPM_HASH = "d5610073fc710dbab464ea84ab6333a9b12b9a48670a71c0698c13a3a44b776a87ce29bd555a01983d7443d94cfc4684d9d9b5a9c192aad78079f28631141d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-google-trans-new \
python310-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-urllib3"

inherit rpm
