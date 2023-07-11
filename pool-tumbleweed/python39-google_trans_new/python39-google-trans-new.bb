SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python39-google_trans_new-1.1.9-1.3.noarch.rpm"
RPM_HASH = "f0bc4e3ba851dedd009d96daa4688f99c3ef930017efbbb189e0e2afb4b3d78391e2d4b3fca44cbd035aa029c489b3d2394b60220ad3d49b2873ac04ec769575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-google-trans-new \
python39-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-urllib3"

inherit rpm
