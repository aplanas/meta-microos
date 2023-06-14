SUMMARY = "Microsoft Authentication Library (MSAL) for Python Extensions"
DESCRIPTION = "The Microsoft Authentication Library (MSAL) for Python library enables your app \
to access the Microsoft Cloud by supporting authentication of users with Microsoft \
Azure Active Directory accounts (AAD) and Microsoft Accounts (MSA) using industry \
standard OAuth2 and OpenID Connect. \
 \
This packages contains additional extensions."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-msal-extensions-1.0.0-2.1.noarch.rpm"
RPM_HASH = "e5491f78505573b1ca83f27552e9bd4dfdf667b8e2d6908d6ac43ee01eb24be5d214fcb97c3889367102c6435bac58ea3236576bfe60c166f428eeb87f32326f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msal-extensions \
python39-msal-extensions \
python3dist-msal-extensions"

RDEPENDS:${PN} += "python-abi \
python39-msal \
python39-portalocker"

inherit rpm
