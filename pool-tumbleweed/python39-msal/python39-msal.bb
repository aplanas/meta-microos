SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "python39-msal-1.22.0-1.3.noarch.rpm"
RPM_HASH = "15242dc5c19cd73103b79ff51ffb6d45539f1b8149f65946a6bd9db99d5370d489ec1e142652db4a255961ebedf7eab089bd3a0efa2b4db17a3fc3d16e8069d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msal \
python39-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-cryptography \
python39-requests"

inherit rpm
