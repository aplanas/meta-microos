SUMMARY = "Preconfigure Python global environment to run scripts within"
DESCRIPTION = "Set up Python global environment using a wrapper script, and \
then run another script within that environment, ala pdb, profile, etc."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-main-wrapper-0.1.1-1.6.noarch.rpm"
RPM_HASH = "7c3b7bedc8ef11e27c577c0aad0e462ce5dce23147e97cb5af6dcc2e02d66ec1675f6e0e16791b86841bfc4f0f13962b3eb9e8b7947a84e2940fcfe0b527bc6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-main-wrapper \
python3.11dist-main-wrapper \
python311-main-wrapper \
python3dist-main-wrapper"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-base \
python311-six \
update-alternatives"

inherit rpm
