SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python311-google_trans_new-1.1.9-1.1.noarch.rpm"
RPM_HASH = "807c75a8ce0584c4adc213a1510bfae768c66e8935d7ccc1360157d752d94aaa407d205a48805af6b7c25a19dfd64790e508b69454514d34e402bbcd7b3e2a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-google-trans-new \
python311-google-trans-new \
python3dist-google-trans-new"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-urllib3"

inherit rpm
