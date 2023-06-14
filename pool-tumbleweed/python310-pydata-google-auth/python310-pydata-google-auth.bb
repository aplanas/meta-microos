SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-pydata-google-auth-1.1.0-1.11.noarch.rpm"
RPM_HASH = "7d4b88ddfe0ef6c7345235a3409b131baa7c004f5264abbe34c832a40e359627bf2ca868423ae1004e07e644a53834545d4afbe3f934c38c599fa8783a42404f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-google-auth \
python3.10dist-pydata-google-auth \
python310-pydata-google-auth \
python3dist-pydata-google-auth"

RDEPENDS:${PN} += "python-abi \
python310-google-auth \
python310-google-auth-oauthlib"

inherit rpm
