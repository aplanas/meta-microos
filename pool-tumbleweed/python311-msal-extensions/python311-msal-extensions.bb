SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-msal-extensions-1.0.0-2.3.noarch.rpm"
RPM_HASH = "e7fe3fe444b6177ba7170b1ed8e71ff694db93577411728cf9c1f9b6ab9e083d8d2a72cf4552dd91f21f82747cc0324988bf88819bfe4e39cc57aab7a15ebbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msal-extensions \
python3.11dist-msal-extensions \
python311-msal-extensions \
python3dist-msal-extensions"

RDEPENDS:${PN} += "python-abi \
python311-msal \
python311-portalocker"

inherit rpm
