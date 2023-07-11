SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python39-httpsig_cffi-15.0.0-3.6.noarch.rpm"
RPM_HASH = "d2057a6a794d310a152e8419fc3713ebe71282f2927323a626c13a430a55f2a058263e8e06fba3c93935604eac31cf1b5f03ae6a99231e5acf2b3c4500ba73a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpsig-cffi \
python39-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-requests \
python39-six"

inherit rpm
