SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-pydata-google-auth-1.1.0-1.13.noarch.rpm"
RPM_HASH = "4c593bef1ed0568ec06df86b2536d9e47fa60d5181a0ef3d277e3d9e4bdd0ca8ad86191e5a7a15aa96e820841e4d058fc13e0ec584cdff3282a511f4887ccf06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydata-google-auth \
python310-pydata-google-auth \
python3dist-pydata-google-auth"

RDEPENDS:${PN} += "python-abi \
python310-google-auth \
python310-google-auth-oauthlib"

inherit rpm
