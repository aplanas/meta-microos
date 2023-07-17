SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python311-google_trans_new-1.1.9-2.1.noarch.rpm"
RPM_HASH = "3a54fdb43b08d8f721d56a85664b8296585f59d7c64afa0c15c5e3b7d5389e9985dfb001f5f256d7028778b8d203bb82880cf48a06a5bfba32e407365341d31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-trans-new \
python3.11dist-google-trans-new \
python311-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-urllib3"

inherit rpm
