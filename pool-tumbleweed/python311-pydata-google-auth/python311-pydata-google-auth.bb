SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-pydata-google-auth-1.1.0-1.13.noarch.rpm"
RPM_HASH = "8f1ec23c2339a39c4a50453a01a92fcf4dd067d28f601bae3b389483daa85b77bb56c0d38005f299699695223b9119a1e87b4b70002f0afae963b490a0d6d242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-google-auth \
python3.11dist-pydata-google-auth \
python311-pydata-google-auth \
python3dist-pydata-google-auth"

RDEPENDS:${PN} += "python-abi \
python311-google-auth \
python311-google-auth-oauthlib"

inherit rpm
