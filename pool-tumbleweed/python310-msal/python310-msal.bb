SUMMARY = "Microsoft Authentication Library (MSAL) for Python"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "python310-msal-1.22.0-1.1.noarch.rpm"
RPM_HASH = "2b75b6acfffec19723d190a6510917179876d741c39fe5470317b3c4eb16f64fb18a3b659c542fc97884bc2794ea6f15d6e39791e49e6a584ec7be47e6946288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msal \
python3.10dist(msal) \
python310-msal \
python3dist(msal)"

RDEPENDS:${PN} += "python(abi) \
python310-PyJWT \
python310-cryptography \
python310-requests"

inherit rpm
