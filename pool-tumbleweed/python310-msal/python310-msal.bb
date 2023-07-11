SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "python310-msal-1.22.0-1.3.noarch.rpm"
RPM_HASH = "e7e25c6406e6fe6144115bc6a29a2d4feb58091def07bb867c5499b9c48326306349b793331dfaea7de174fc85ef3ba40e4bfe1e88d21fd0b24f8bf11e93e2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msal \
python310-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-cryptography \
python310-requests"

inherit rpm
