SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.24.0~b1"

RPM_NAME = "python39-msal-1.24.0~b1-1.1.noarch.rpm"
RPM_HASH = "36f6e207c484a61b6a9ab82ad9d4771b9f4573acc126801b89084539a043bd1c66a96c33b8084dab0b4c8cb729e9251dcfcbec6bcef41d10a09fc93e93b5fb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msal \
python39-msal \
python3dist-msal"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-cryptography \
python39-requests"

inherit rpm
