SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python39-google_trans_new-1.1.9-1.1.noarch.rpm"
RPM_HASH = "a7f92c90635e363019472a865619b24678c924b2901d9bc41696c521ad29fdf34b85d2c855b7cae5d8dd8e3c8c79826eb4a9cd4b0684628e86de254aa8792c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-trans-new) \
python39-google_trans_new \
python3dist(google-trans-new)"
RDEPENDS:${PN} += "python(abi) \
python39-requests \
python39-urllib3"

inherit rpm
