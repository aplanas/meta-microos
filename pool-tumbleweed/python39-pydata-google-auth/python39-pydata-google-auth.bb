SUMMARY = "PyData helpers for authenticating to Google APIs"
DESCRIPTION = "PyData-Google-Auth is a package providing helpers for authenticating \
to Google APIs."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-pydata-google-auth-1.1.0-1.13.noarch.rpm"
RPM_HASH = "80e4a2f6bf53c4fd822145939597b012d2f1a0c276e43af0b70cdc15aa4a07f1fdd6b11681b909b91b7e0fede9660a288d9ae40e12856b374df7c77c7629dd6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydata-google-auth \
python39-pydata-google-auth \
python3dist-pydata-google-auth"

RDEPENDS:${PN} += "python-abi \
python39-google-auth \
python39-google-auth-oauthlib"

inherit rpm
