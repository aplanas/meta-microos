SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.24.0~b1"

RPM_NAME = "python311-msal-1.24.0~b1-1.1.noarch.rpm"
RPM_HASH = "f30b4e16f28b23519239472c1f0415a5abe79908c1026963052b981eb06b9c7d82fff5ae417cf5a347ac93e795f2e14f6c61c377239df334a9b3d6c3171d548b"
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
