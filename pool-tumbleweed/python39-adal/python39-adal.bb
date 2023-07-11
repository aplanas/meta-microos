SUMMARY = "Azure Active Directory library"
DESCRIPTION = "The ADAL for Python library makes it easy for python application to authenticate to \
Azure Active Directory (AAD) in order to access AAD protected web resources."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python39-adal-1.2.7-1.11.noarch.rpm"
RPM_HASH = "80c3ac385c3e313be0aefaa0b6bef3e0f2336e79b48f5444c47ec5deae72dd438e4da96c0a9ccfef063aff23d2e6cb25ff35d4e64c4a952e6ed9e3205bc36057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-adal \
python39-adal \
python3dist-adal"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-cryptography \
python39-python-dateutil \
python39-requests"

inherit rpm
