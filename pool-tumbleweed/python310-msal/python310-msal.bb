SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.24.0~b1"

RPM_NAME = "python310-msal-1.24.0~b1-1.1.noarch.rpm"
RPM_HASH = "8346351ebe8bbf1481bd351c2347488d3d2c2f367501a3635c7c108202aaf61efc999f93010215f13a7525f876b617a1b7ed62717b1ddaa292f48e5a50c63272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msal \
python310-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-cryptography \
python310-requests"

inherit rpm
