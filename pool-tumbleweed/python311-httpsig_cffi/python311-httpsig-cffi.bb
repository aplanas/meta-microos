SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python311-httpsig_cffi-15.0.0-3.4.noarch.rpm"
RPM_HASH = "3a3b4e2b243b399563ae6a6b4c3ee69be45c825fd4e2091a6d25fce27e2d04ef17abfaeeda931db536470e29dcf3c979921a4510a9f693b4193319b1dc645554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-httpsig-cffi \
python311-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-requests \
python311-six"

inherit rpm
