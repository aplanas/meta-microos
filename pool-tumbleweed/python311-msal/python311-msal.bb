SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "python311-msal-1.22.0-1.3.noarch.rpm"
RPM_HASH = "683b9c7f4551820af0ad6db20d7fddac592a6aae68f7fe81bb0e287c15dba4a7390d3f24754df606e8c277edeb38f2bb3cf68efee499db79def85173b917fbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msal \
python3.11dist-msal \
python311-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-cryptography \
python311-requests"

inherit rpm
