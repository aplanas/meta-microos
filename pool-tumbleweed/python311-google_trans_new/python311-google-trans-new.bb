SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python311-google_trans_new-1.1.9-1.3.noarch.rpm"
RPM_HASH = "4d881f4a10051e7736d9cdea1329f9c5add0dfcbdfec2b2a67b0c075a02486ac2eafe45a2a403dc6bc2043ae1d2765e76f4510b2af8a72237579451b7152c17e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-trans-new \
python3.11dist-google-trans-new \
python311-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-urllib3"

inherit rpm
