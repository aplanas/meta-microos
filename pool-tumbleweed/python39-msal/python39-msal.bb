SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "python39-msal-1.22.0-1.1.noarch.rpm"
RPM_HASH = "c3e27293a9a57af5a4d692b5224140a154ca4a5309e2683481429b4442ead3686578bd138a9959a93234b55c792eae0b8a3dcacab2f30eed1d70a7de09d79b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(msal) \
python39-msal \
python3dist(msal)"

RDEPENDS:${PN} += "python(abi) \
python39-PyJWT \
python39-cryptography \
python39-requests"

inherit rpm
