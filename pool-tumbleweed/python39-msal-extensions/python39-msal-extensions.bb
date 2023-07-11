SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-msal-extensions-1.0.0-2.3.noarch.rpm"
RPM_HASH = "7fa7fb14cf85d67d11e10b2a632954f55095db117ba1cbdb308da0818346ee616cc3fb6812f9bd8bc0a600f897e058d68d15af08a0ce27cf83585b2197cd9f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msal-extensions \
python39-msal-extensions \
python3dist-msal-extensions"

RDEPENDS:${PN} += "python-abi \
python39-msal \
python39-portalocker"

inherit rpm
